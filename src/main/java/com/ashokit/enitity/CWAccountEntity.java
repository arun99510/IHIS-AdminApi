package com.ashokit.enitity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "CASEWORKER_ACCOUNT")
public class CWAccountEntity {

	@Id
	@GeneratedValue
	private Integer cwId;
	private String fullName;
	private String email;
	private Double phno;
	private String gender;
	private LocalDate dob;
	private Double ssn;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(insertable = false)
	@CreationTimestamp
	private LocalDate updatedDate;
	
	
	
}
