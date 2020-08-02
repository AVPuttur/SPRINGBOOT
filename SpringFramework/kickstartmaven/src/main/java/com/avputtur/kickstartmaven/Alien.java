package com.avputtur.kickstartmaven;

public class Alien {
	
	private int age;
	private Computer com;
	
	public Alien() {
		System.out.println("Alien object created..");
	}
	
//	public Alien(int age) {
//		super();
//		this.age = age;
//	}

	

	public int getAge() {
		return age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void code() {
		System.out.println("Alien class....");
		com.compile();
	}

}
