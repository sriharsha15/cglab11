package com.cg.eis.pl;


import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("id");
		int id=sc.nextInt();
		System.out.println("name");
		 String name=sc.next();
		 System.out.println("salary");
		 int salary=sc.nextInt();
		 System.out.println("designation1");
		String designation=sc.next();
		Employee obj1=new Employee();
		obj1.setDesignation(designation);
		obj1.setId(id);
		obj1.setName(name);
		obj1.setSalary(salary);
		Service obj=new Service();
		obj.insuranceSystem(salary,designation);
		System.out.println(obj1.toString());
		
		
		

	}

}
