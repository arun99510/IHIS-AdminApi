package com.ashokit.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CWAccountBinding {

	private String fullName;
	private String email;
	private Double phno;
	private String gender;
	private LocalDate dob;
	private Double ssn;
	
	
}
