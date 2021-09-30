package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/board")
public class Boardcontroller {
	
	@RequestMapping(value = "/{boardNo}", method = {RequestMethod.GET, RequestMethod.PUT})
	public String list(HttpServletRequest request) {
		return "/home";
	}
	
	
}
