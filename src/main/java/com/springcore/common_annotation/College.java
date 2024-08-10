package com.springcore.common_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	//<bean class="prin" name="p1">
	
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	public College() {
		super();
	}

	public College(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public College(Principal principal) {
		super();
		this.principal = principal;
	}

	public College(Principal principal, Teacher teacher) {
		super();
		this.principal = principal;
		this.teacher = teacher;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
