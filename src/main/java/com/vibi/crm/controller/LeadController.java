package com.vibi.crm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class LeadController {

	@RequestMapping(method = RequestMethod.POST, value = "/welcome")
	public String welcome() {
		return "Welcome to ViBi Software Solutions...!";
	}

}
