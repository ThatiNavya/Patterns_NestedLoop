package com.multipicationDemo;
import java.io.*;
public class Multiplication {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i =1;i<=10;i++) {
        	System.out.println(num+"*"+i+"="+num*i);
        }
	}
}
