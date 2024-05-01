package com.example.teamLog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.teamLog.dto.TeamLogDto;

@Mapper
public interface TeamLogDao {

	public void reg (TeamLogDto dto);
	public List<TeamLogDto> list();
	public TeamLogDto select(String id, String pw);
	public void delete(int mno);
}
