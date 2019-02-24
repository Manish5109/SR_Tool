package com.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.entity.EmployeeProfile;

public interface ProfileRepository extends CrudRepository<EmployeeProfile, Long> {
	
	public EmployeeProfile findByempId(Long empId);

}
