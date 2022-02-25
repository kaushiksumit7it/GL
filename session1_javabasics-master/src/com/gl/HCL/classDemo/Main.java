package com.gl.HCL.classDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		emp.setEmpId(scan.nextInt());
		System.out.println("Enter Employee Name");
		emp.setEmpName(scan.next());
		System.out.println("Enter Employee Email");
		emp.setEmpEmail(scan.next());
		System.out.println(emp);

	}

}
