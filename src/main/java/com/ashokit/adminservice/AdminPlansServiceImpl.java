package com.ashokit.adminservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.AdminPlansBinding;
import com.ashokit.binding.CWAccountBinding;
import com.ashokit.enitity.AdminPlansEntity;
import com.ashokit.enitity.CWAccountEntity;
import com.ashokit.repo.AdminPlansRepo;
import com.ashokit.repo.CWAccountRepo;

@Service
public class AdminPlansServiceImpl implements IAdminService {

	@Autowired
	private AdminPlansRepo adminRepo;
	@Autowired
	private CWAccountRepo cwRepo;

	@Override
	public String savePlan(AdminPlansBinding plansBinding) {

		AdminPlansEntity entity = new AdminPlansEntity();
		BeanUtils.copyProperties(plansBinding, entity);
		adminRepo.save(entity);
		return "Admin plans saved successfully";
	}

	@Override
	public List<AdminPlansBinding> viewPlans() {

		List<AdminPlansEntity> adminEnitity = adminRepo.findAll();

		List<AdminPlansBinding> bindings = new ArrayList<>();
		adminEnitity.forEach(plans -> {
			AdminPlansBinding adminBinding = new AdminPlansBinding();
			BeanUtils.copyProperties(plans, adminBinding);
			bindings.add(adminBinding);
		});

		return bindings;
	}

	@Override
	public String saveCwAccount(CWAccountBinding accountBinding) {

		CWAccountEntity accountEntity=new CWAccountEntity();
		BeanUtils.copyProperties(accountBinding, accountEntity);
		cwRepo.save(accountEntity);
		
		return "Caeworker Account created successfully";
	}

	@Override
	public List<CWAccountBinding> viewCwAccount() {
List<CWAccountEntity> cwAccounts = cwRepo.findAll();
List<CWAccountBinding> cwlist=new ArrayList<>();
for(CWAccountEntity list:cwAccounts)
{
	CWAccountBinding accountBinding=new CWAccountBinding();
	BeanUtils.copyProperties(list, accountBinding);
	cwlist.add(accountBinding);
}

		return cwlist;
	}

}
