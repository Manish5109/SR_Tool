package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.entity.EmployeeProfile;
import com.study.repository.ProfileRepository;

public class EmployeeProfileServiceIMPL implements EmployeeProfileService {

	@Autowired
	ProfileRepository pr;
	
	@Override
	public EmployeeProfile saveProfile(EmployeeProfile ep) {
		// TODO Auto-generated method stub
		return pr.save(ep);
		
	}

}
