package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.model.UsersModel;

@Service
public class UsersService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
    public String registerProblem(UsersModel user) {

        String sql = "INSERT INTO usersProblem(username, phone, problemDescription) VALUES(?,?,?)";

        jdbcTemplate.update(
                sql,
                user.getUserName(),
                user.getPhone(),
                user.getProblemDescription()
        );

        return "Problem Submitted Successfully";
    }
}
