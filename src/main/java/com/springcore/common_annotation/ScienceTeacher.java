package com.springcore.common_annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("I am Science Teacher");
		
	}

}
