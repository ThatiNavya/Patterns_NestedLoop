package com.alphabetsPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetsDemo {
	public static void main(String[] args) throws Exception {
		int a =65; //ASCII value of capital A i 65
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
		for(int i=1;i<num;i++)
		{
		   for(int j=1;j<=i;j++)
		   {
		   System.out.print((char)a);
		   }
		   System.out.println();
		   a++;
    	}
    }
}