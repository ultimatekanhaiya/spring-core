package com.springcore.consinject;

public class Certificate {
	private String course;
	private String duration;

	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}

}
