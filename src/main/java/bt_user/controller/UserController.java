package bt_user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import bt_user.entity.User;
import bt_user.service.UserServiceImplementation;

@Controller
public class UserController {

	@Autowired
	private UserServiceImplementation service;
	
	// get user_data start
	@PostMapping("/get")
	public String getUsersFromDBPost() {
		return "redirect:/userList";
	}
	
	@GetMapping("/userList")
	public String getUsersFromDBGet(Model model) {
		List<User> userList = service.getUsers();
		model.addAttribute("users",userList);
		return "index";
	}
	// get user_data end
}
