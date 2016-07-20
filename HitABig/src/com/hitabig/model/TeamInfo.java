package com.hitabig.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TeamInfo {
	private int team_Code;
	private String team_Name;
	private String team_Type;
	private Double grade;
	private String header;
	@Id
	public int getTeam_Code() {
		return team_Code;
	}
	public void setTeam_Code(int team_Code) {
		this.team_Code = team_Code;
	}
	public String getTeam_Name() {
		return team_Name;
	}
	public void setTeam_Name(String team_Name) {
		this.team_Name = team_Name;
	}
	public String getTeam_Type() {
		return team_Type;
	}
	public void setTeam_Type(String team_Type) {
		this.team_Type = team_Type;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
	
	
	

}
