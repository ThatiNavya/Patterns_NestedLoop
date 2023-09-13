package com.alphabetsPatterns;
import java.io.*;
public class LeftTriangle {
	public static void main(String[] args) throws IOException, InterruptedException {
		int a =65; //ASCII value of capital A i 65
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
        String s = br.readLine();
        int num=Integer.parseInt(s);
        for(int i=1;i<=num;i++) {
        	for(int j=num;j>=i;j--) {
        		System.out.print("  ");
        		Thread.sleep(100);
           	}
        	for(int k=1;k<=i;k++) {
    			System.out.print(" "+(char)a);
    		
    			Thread.sleep(100);
    			}
        	a++;
        	 System.out.println("");
        }

}
}
