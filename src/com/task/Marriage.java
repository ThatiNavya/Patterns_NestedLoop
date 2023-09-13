/*Q 1:Write a java program to read person basic salary and calculate Provident Fund amount from the basic salary

Formula : Provident Fund is 12 % of Basic Salary*/


package com.task;
import java.io.*;
public class Marriage {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Your Age:");
        String s1 =br.readLine();
        int age= Integer.parseInt(s1);
        
        System.out.println("Enter Your Salary:");
        String s2 = br.readLine();
        double salary=Double.parseDouble(s2);
        
        if(age<30&& salary>100000) {
        	System.out.println("You are Eligible For Marriage");
        }
        else {
        	System.out.println("You are not Eligible For Marriage");
        }
        
	}

}
