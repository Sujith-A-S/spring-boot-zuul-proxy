package com.poc.educator.dto;

public class Educator {
	
	private String educatorName;
	private String teachesForClass;
	
	public Educator(String educatorName, String teachesForClass) {
		super();
		this.educatorName = educatorName;
		this.teachesForClass = teachesForClass;
	}
	
	public String getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}
	public String getTeachesForClass() {
		return teachesForClass;
	}
	public void setTeachesForClass(String teachesForClass) {
		this.teachesForClass = teachesForClass;
	}

}
