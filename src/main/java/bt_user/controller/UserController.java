package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.UserServiceImplementation;

@Controller
public class UserController {

	@Autowired
	private UserServiceImplementation service;
	
	
}
