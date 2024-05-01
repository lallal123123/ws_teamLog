package com.example.teamLog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamLog.dao.TeamLogDao;
import com.example.teamLog.dto.TeamLogDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class LoginService {

	@Autowired
	TeamLogDao dao;
	
	public String login(String id,String pw,HttpServletRequest request) {
		TeamLogDto dto = dao.select(id, pw);
		String msg="";
		HttpSession session = request.getSession();
		if(dto ==null) {
			msg="회원정보가 없습니다.";
			
		}else {
			session.setAttribute("id", dto.getId());
			session.setAttribute("pw", dto.getPw());
			session.setAttribute("role", dto.getRole());
			session.setAttribute("mno", dto.getMno());
			msg="로그인 성공!";
		}
		return msg;
	}
	
	public void reg(TeamLogDto dto) {
		dao.reg(dto);
	}
}
