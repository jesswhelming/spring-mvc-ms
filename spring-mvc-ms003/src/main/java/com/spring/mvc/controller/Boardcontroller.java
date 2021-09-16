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
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(HttpServletRequest request) {
		return "/board/register";
	}
	
	@RequestMapping(value = "/read/{boardNo}", method = RequestMethod.GET)
	public String read(@PathVariable("boardNo") String boardNo, HttpServletRequest request, Model model) {
		
		return "/board/read";
	}
	
	@RequestMapping(value = "/read2/{no}", method = RequestMethod.GET)
	public String read2(@PathVariable("no") String no, HttpServletRequest request) {
		return "/board/read";
	}
}
