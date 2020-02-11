package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service extends Employee implements EmployeeService  {
	
	String insuranceScheme;
	public String insuranceSystem(int salary,String designation) {
		// TODO Auto-generated method stub
		 if (salary>=40000 && designation.equals("Manager"))
		 {
	        	insuranceScheme="Scheme A";
	        	//System.out.println(insuranceScheme);
		 }
		 else  if (salary>=20000 && salary <40000 && designation.equals("Programmer"))
		 {
	        	insuranceScheme="Scheme B";
	        	//System.out.println(insuranceScheme);
		 }
		 else if (salary>5000 && salary <20000 && designation.contentEquals("System Associate"))
		 {
	             insuranceScheme="Scheme C";
	            // System.out.println(insuranceScheme);
		 }
		 else if(salary<5000 && designation.equals("Clerk"))
		 {
	        	insuranceScheme="No Scheme";
	      	System.out.println(insuranceScheme);
		 }
		 return insuranceScheme;
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String insuranceSystem() {
		// TODO Auto-generated method stub
		return null;
	}




}
