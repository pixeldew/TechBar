package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.model.UsersModel;
@Service
public class UsersService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public String registerProblem(UsersModel user) {

        String sql = "INSERT INTO usersProblem(userName, phone, problemDescription ,status) VALUES(?,?,?,?)";

	        jdbcTemplate.update(
	                sql,
	                user.getUserName(),
	                user.getPhone(),
	                user.getProblemDescription(),
	                "Waiting"
	        );

	        return "Problem Submitted Successfully";
	    }
	 
	 public List<UsersModel> getAllProblems() {

	        String sql = "SELECT * FROM usersProblem";

	        return jdbcTemplate.query(sql, (rs, rowNum) -> {

	            UsersModel user = new UsersModel();

	            user.setId(rs.getInt("id"));
	            user.setUserName(rs.getString("userName"));
	            user.setPhone(rs.getString("phone"));
	            user.setProblemDescription(
	                    rs.getString("problemDescription"));
	            user.setStatus(rs.getString("status"));

	            return user;
	        });
	    }
	
	public String startProblem(int id) {
		String sql ="UPDATE usersProblem SET status='SERVING' WHERE id=? ";
		 jdbcTemplate.update(sql,id );
		 return "users problem start";
	}
	public String resolveProblem(int id) {
		String sql ="UPDATE usersProblem SET status='RESOLVED' WHERE id=? ";
		 jdbcTemplate.update(sql,id); 
		 return "users problem resolve";
		
	}
	public String deleteProblem(int id) {
		String sql ="DELETE FROM usersProblem WHERE id=?";
		jdbcTemplate.update(sql,id );
		return "users problem delete";
		
	}

}
