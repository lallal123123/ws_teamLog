package com.example.teamLog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamLogDto {
	
	private int mno;
	private String id;
	private String pw;
	private String role;
	
	
	TeamLogDto (String id, String pw, String role){
		this.id = id;
		this.pw = pw;
		this.role = role;
	}
}
