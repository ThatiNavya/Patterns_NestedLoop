package com.starPattern;
import java.io.*;
public class DiamondPattern {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i=1;i<=num;i++) {  //num=5  //upper pyramid
        	for(int j=i;j<num;j++) {
        		System.out.print(" ");
        		Thread.sleep(100);
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print("* ");
        		Thread.sleep(100);
        	}
        	System.out.println(" ");
        	Thread.sleep(300);
        }
        for(int n=1;n<num;n++) {          // reverse pyramid
        	for(int m=1;m<=n;m++) {
        		System.out.print(" ");
        	}
        	for(int l=n;l<num;l++) {
        		System.out.print("* ");
        		Thread.sleep(100);
        	}
        	System.out.println("");
        }      Thread.sleep(300);
	}

}
