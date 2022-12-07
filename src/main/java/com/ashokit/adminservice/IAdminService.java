package com.ashokit.adminservice;

import java.util.List;

import com.ashokit.binding.AdminPlansBinding;
import com.ashokit.binding.CWAccountBinding;

public interface IAdminService {

	public String savePlan(AdminPlansBinding plansBinding);
	
	List<AdminPlansBinding> viewPlans();
	
	public String saveCwAccount(CWAccountBinding accountBinding);
	
	public List<CWAccountBinding> viewCwAccount();
	
}
