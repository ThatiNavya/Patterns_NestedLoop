package com.task;

import java.io.*;

public class EmployeePf {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Basic Salary");
		String s1 = br.readLine();
		double basicSalary = Double.parseDouble(s1);

		double empPf = basicSalary * 12 / 100;
		System.out.println("Employeepf:"+empPf);
		int permonth = (int) (empPf / 12);
		System.out.println("permonth:"+permonth);
	}

}
