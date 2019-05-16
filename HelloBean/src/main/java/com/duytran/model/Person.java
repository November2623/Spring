package com.duytran.model;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void init() {
		System.out.println("Khoi tao");
	}
	public void destroy() {
		System.out.print("Huy");
	}
}
