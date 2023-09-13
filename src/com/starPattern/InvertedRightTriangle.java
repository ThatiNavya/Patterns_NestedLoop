package com.starPattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InvertedRightTriangle {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i=1;i<=num;i++) {
        	for(int j=i;j<num;j++) {
        		System.out.print("*");
        	}
        	System.out.println(" ");
        }
	}
}
