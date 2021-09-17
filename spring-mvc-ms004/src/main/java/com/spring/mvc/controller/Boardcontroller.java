package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class Boardcontroller {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		return "/board/list";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyForm(HttpServletRequest request) {
		return "/board/modify";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request) {
		return "/board/success";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request) {
		return "/board/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request) {
		return "/board/success";
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(HttpServletRequest request) {
		return "/board/success";
	}
	
	@RequestMapping(value = "/read/{boardNo}", method = RequestMethod.GET)
	public String read(@PathVariable("boardNo") String boardNo, HttpServletRequest request, Model model) {
		
		return "/board/read";
	}
}
