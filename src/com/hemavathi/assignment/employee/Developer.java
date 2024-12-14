package com.hemavathi.assignment.employee;

//Developer Class

public class Developer extends Employee{
	private String pro_lang;
	
	public Developer(String name,int employeeId,double salary,String pro_lang){
		super(name,employeeId,salary);
		this.pro_lang=pro_lang;	
	}

	public String getPro_lang() {
		return pro_lang;
	}

	public void setPro_lang(String pro_lang) {
		this.pro_lang = pro_lang;
	}
	
	

}
