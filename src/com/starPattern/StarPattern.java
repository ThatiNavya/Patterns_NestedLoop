package com.starPattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StarPattern {
   public static void main(String[] args) throws Exception {
	   InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number to print stars:");
       String s = br.readLine();
       int num = Integer.parseInt(s);
       for(int i=1;i<=num;i++) {  
       	System.out.println("*");
       	Thread.sleep(100);
       }
   }
}

	


