package com.corejave.practice;
class Controller {
	private String name;
	private String team;
	private int age;

	Controller() {
		name = "";
		team = "";
		age = 0;

	}
	
	//defining the parameterized constructor
	
	Controller(String n, String t, int a) {
		name = n;
		team = t;
		age = a;

	}
	
	// defining copy constructor

	Controller(Controller cc) {
		name = cc.name;
		team = cc.team;
		age = cc.age;
	}
	
	// toString function returns the string representation of object.
	public String toString() {
		return "this is " + this.getName() + "of" + this.getTeam();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}

public class TestController1 {
	public static void main(String[] args) {
		Controller obj = new Controller();
		System.out.println(obj);
		
		obj.setName("Rahul");
		obj.setTeam("India"); 
		
		//obj.age = 32;
		System.out.println(obj);

		Controller obj1 = new Controller("Sachin", "India", 40);
		System.out.println(obj1);

		Controller obj2 = new Controller(obj1);
		System.out.println(obj2);

	}
}
