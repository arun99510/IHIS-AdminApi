package com.ashokit.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminPlansBinding {

	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	
	
	
}
