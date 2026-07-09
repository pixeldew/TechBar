package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	 
	@GetMapping("/all")
	public List<UsersModel> getAllProblems() {
	    return service.getAllProblems();
	}
	
	@PutMapping("/start/{id}")
	public String startProblem(@PathVariable int id) {
		return service.startProblem(id);
		
	}
	
	@PutMapping("/resolve/{id}")
	public String resolveProblem(@PathVariable int id) {
		return service.resolveProblem(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProblem(@PathVariable int id) {
		return service.deleteProblem(id);
	}
	
	}


