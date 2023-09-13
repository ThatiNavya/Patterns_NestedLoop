package com.starPattern;
import java.io.*;
public class RightTriangle {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        		Thread.sleep(100);
        	}
        	System.out.println("");
        }

	}

}
