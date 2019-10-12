package com.corejave.practice;

public class call_value {
	public void value(int x){
		//x=100;
		System.out.println(x);
		
	}
	public static void main(String[] args){
		int x=50;
		call_value c=new call_value();
		c.value(x);
		System.out.println(x);
		
	}
}
