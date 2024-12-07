package com.stock.analysis.MyAnalysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.analysis.MyAnalysis.dto.User;
import com.stock.analysis.MyAnalysis.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
	@Autowired
	  private  UserService userService;

	  
	    @GetMapping
	    public ResponseEntity<List<User>> home() {
	        return new ResponseEntity<>( userService.getAllUsers(),HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<List<User>> addUser(@RequestBody User user) {
	        userService.saveUser(user);
	        return new ResponseEntity<>( userService.getAllUsers(),HttpStatus.OK);
	    }
}
