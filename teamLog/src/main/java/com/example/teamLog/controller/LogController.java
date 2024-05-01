package com.example.teamLog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.teamLog.dao.TeamLogDao;
import com.example.teamLog.dto.TeamLogDto;
import com.example.teamLog.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class LogController {
	
	@Autowired
	TeamLogDao dao;
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping("/")
	public String root() {

		return "index";
	}
	@RequestMapping("loginForm")
	public void loginForm() {
		
	}
	@RequestMapping("login")
	public String login(@RequestParam("id") String id,@RequestParam("pw") String pw,HttpServletRequest request ,Model model) {
		String msg = service.login(id, pw, request);
		model.addAttribute("msg", msg);
		return "loginForm";
	}
	
	@RequestMapping("regForm")
	public void regForm() {
		
	}
	
	@RequestMapping("reg")
	public String reg(TeamLogDto dto) {
		service.reg(dto);
		
		return "index";
	}

}
