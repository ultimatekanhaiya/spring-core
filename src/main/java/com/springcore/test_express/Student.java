package com.springcore.test_express;

public class Student {

	private int id;
	private String name;
	private Cheat cheat;

	public Student() {
		super();
	}

	public Student(int id, String name, Cheat cheat) {
		super();
		this.id = id;
		this.name = name;
		this.cheat = cheat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

}
