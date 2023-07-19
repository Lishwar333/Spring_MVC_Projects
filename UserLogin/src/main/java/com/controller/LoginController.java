package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.ILoginDao;

@Controller
public class LoginController {
	
	ILoginDao loginDao;
	
	@GetMapping("/login")
	 public String getLoginpage() {
		 
		 return "login";
	 }
	
	@PostMapping("/doLgin")
	public String checkUser(@RequestParam("username") String username,@RequestParam("password")String password ) {
		
		boolean loginFlag=loginDao.validateUser(username, password);
		
				if (loginFlag==true) {
					return "success";
				}else {
					return "failure";
				}
		
	}

}
