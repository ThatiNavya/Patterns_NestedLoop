package com.numberPattern;

import java.io.*;;

public class SquarePatten_Num {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
		String s = br.readLine();
		int num = Integer.parseInt(s);
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i);
				//System.out.print(j);
				Thread.sleep(100);
			}
			System.out.println("");
		}
	}
}
