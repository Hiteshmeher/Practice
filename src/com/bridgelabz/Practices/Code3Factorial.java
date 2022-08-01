package com.bridgelabz.Practices;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class Code3Factorial {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Taking a Number from user
		 * Calculating its Factorial
		 */
		int fact = 1;
		System.out.println("Enter a number for calculating Factorial");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
		input.close();
	}
}