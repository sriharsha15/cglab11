package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service extends Employee implements EmployeeService  {
	
	
	public void insuranceSystem(int salary,String designation) {
		// TODO Auto-generated method stub
		 if (salary>=40000 && designation=="Manager")
		 {
	        	insuranceScheme="Scheme A";
	        	System.out.println(insuranceScheme);
		 }
	        if (salary>=20000 && salary <40000 && designation=="Programmer")
	        	insuranceScheme="Scheme B";
	        if (salary>5000 && salary <20000 && designation=="System Associate")
	        	insuranceScheme="Scheme C";
	        if (salary<5000 && designation=="Clerk")
	        	insuranceScheme="No Scheme";
		
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insuranceSystem() {
		// TODO Auto-generated method stub
		
	}

}
