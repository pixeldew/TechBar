package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UsersModel;
import com.service.UsersService;

@RestController
@RequestMapping("/userRegistration")
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {

	 @Autowired
	    UsersService service;
	 
	    @PostMapping("/registerProblem")
	    public String registerProblem(@RequestBody UsersModel user) {

	        return service.registerProblem(user);

	    }
	    
}
