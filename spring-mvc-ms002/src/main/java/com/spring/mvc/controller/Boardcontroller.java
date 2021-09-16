package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board", method = RequestMethod.GET)
public class Boardcontroller {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyForm(HttpServletRequest request) {
		return "/board/modify";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request) {
		return "/board/register";
	}
}
