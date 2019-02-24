package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.EmployeeProfile;
import com.study.service.EmployeeProfileServiceIMPL;
//test
@RestController
@RequestMapping("/SR")
public class AppController {
	
	@Autowired
	EmployeeProfileServiceIMPL service;
	
	@PostMapping
	public EmployeeProfile save(@RequestBody EmployeeProfile ep ) {
		return service.saveProfile(ep);
	}

}
