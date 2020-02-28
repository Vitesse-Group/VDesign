package com.vitesse.controller;
import com.vitesse.model.*;
import com.vitesse.repository.AppRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
	private AppRepository appRepository;
	
    @RequestMapping(value="/", method=RequestMethod.GET)
	public List<Test> home() {
    	System.out.println("Test Controller");
		return appRepository.findAll();
	}
    
    @RequestMapping(value="/Names", method=RequestMethod.GET)
	public List<String> Name(@RequestHeader("x-location")String location) {
    	System.out.println("Hi" + location);
		return appRepository.Names();
	}
}
