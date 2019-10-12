package com.corejave.practice;

public class static_keyword {
	int emp_id;
	String ename;
	static String Cname ="EC-Mobility";
	public void show(int id,String name)
	
	{
		emp_id=id;
		ename=name;
		System.out.println("Id of Emp="+emp_id+"Name of Emp="+ename+"name of company="+Cname);
		
		
	}
	public static void main(String[] args){
		static_keyword obj=new static_keyword();
		obj.show(101,"Neha");
		static_keyword obj1=new static_keyword();
		obj1.show(101,"Pallavi");
	}

}
