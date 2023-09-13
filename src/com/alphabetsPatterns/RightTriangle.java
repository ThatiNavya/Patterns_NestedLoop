package com.alphabetsPatterns;
import java.io.*;
public class RightTriangle {
	public static void main(String[] args) throws Exception {
        int a =65; //ASCII value of capital A i 65
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)a+" ");
				Thread.sleep(100);
				a++; //66 //67
			}
			
			System.out.println("");
		}
		

	}
	

}
