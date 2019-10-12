package com.corejave.practice;

public class overloading {
	void sum (int x,int y){
		System.out.println("Addition is"+(x+y));
		
	}
void sum (int x,int y, float z){
	System.out.println("Addition of X+Y+Z="+(x+y+z));
}
public static void main(String[] args){
	overloading o=new overloading();
	o.sum(10, 35);
	o.sum(10,40,10);
	
}
}
