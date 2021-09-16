package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Boardcontroller {
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public String modifyForm(HttpServletRequest request) {
		return "/board/modify";
	}
	
	@RequestMapping(value = "/board/register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request) {
		return "/board/register";
	}
	
	@RequestMapping(value = "/read/{boardNo}", method = RequestMethod.GET)
	public String read(int boardNo, HttpServletRequest request, Model model) {
		
		return "/board/read";
	}
	
	@RequestMapping(value = "/read/{no}", method = RequestMethod.GET)
	public String read2(int boardNo, HttpServletRequest request) {
		return "/board/read";
	}
}
