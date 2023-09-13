package com.starPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquarePattern {
	public static void main(String[] args)  throws IOException, InterruptedException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
		        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=num;j++) {
        		System.out.print("* ");
        		Thread.sleep(100);
        	}
        	System.out.println("");
        }
	}

}
