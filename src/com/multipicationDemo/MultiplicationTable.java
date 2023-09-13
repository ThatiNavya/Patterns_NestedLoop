package com.multipicationDemo;
import java.io.*;

public class MultiplicationTable {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i=1;i<=10;i++) {
        	for(int j=1;j<=10;j++) {
        		int result =i*j;
        		System.out.printf("%5d",result);
        	}
        	System.out.println("");
        }
	}

}
