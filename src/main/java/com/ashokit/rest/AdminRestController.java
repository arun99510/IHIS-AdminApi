package com.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.adminservice.IAdminService;
import com.ashokit.binding.AdminPlansBinding;
import com.ashokit.binding.CWAccountBinding;

import jakarta.annotation.PostConstruct;

@RestController
public class AdminRestController {

	@Autowired
	private IAdminService adminService;
	
	@PostMapping("/saveplan")
	public ResponseEntity<String> savePlans(@RequestBody AdminPlansBinding binding)
	{
		String savePlan = adminService.savePlan(binding);
		return new ResponseEntity<>(savePlan,HttpStatus.OK);
	}
	@GetMapping("/viewplans")
	public ResponseEntity<List<AdminPlansBinding>> viewPlans()
	{
		List<AdminPlansBinding> viewPlans = adminService.viewPlans();
		return new ResponseEntity<>(viewPlans,HttpStatus.OK);
	}
	@PostMapping("/savecw")
	public ResponseEntity<String> savecw(@RequestBody CWAccountBinding accountBinding)
	{
		String saveCwAccount = adminService.saveCwAccount(accountBinding);
		return new ResponseEntity<>(saveCwAccount,HttpStatus.OK);
	}
	@GetMapping("/viewcw")
	public ResponseEntity<List<CWAccountBinding>> viewcw()	
	{
		List<CWAccountBinding> viewCwAccount = adminService.viewCwAccount();
		return new ResponseEntity<>(viewCwAccount,HttpStatus.OK);
	}
	
}
