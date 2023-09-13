package com.alphabetsPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlaphabetPattern {
	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        
          for(int i=1;i<=num;i++) {
        	 
        	 for(int j=num;j>i;j--) {
        		 System.out.print("  ");
        	 } 
        		int input =65; 
        	for(int k=1;k<=i;k++) {
        		System.out.print((char)(input)+" ");
        		input++;
        	}
        	System.out.println("");
        	
          
          }
       

	}

}
