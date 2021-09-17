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
	
	@RequestMapping(value = "/get", params="list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/get", params="modify", method = RequestMethod.GET)
	public String modifyForm(HttpServletRequest request) {
		return "/board/modify";
	}
	
	@RequestMapping(value = "/post", params="modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/get", params="register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request) {
		return "/board/register";
	}
	
	@RequestMapping(value = "/post", params="register", method = RequestMethod.POST)
	public String register(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/get", params="remove", method = RequestMethod.GET)
	public String removeForm(HttpServletRequest request) {
		return "/board/remove";
	}
	@RequestMapping(value = "/post", params="remove", method = RequestMethod.POST)
	public String remove(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/get", params="read", method = RequestMethod.GET)
	public String read(HttpServletRequest request, Model model) {
		
		return "/board/read";
	}
}
