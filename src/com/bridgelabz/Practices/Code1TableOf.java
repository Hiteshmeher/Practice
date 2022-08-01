package com.bridgelabz.Practices;

import java.util.Scanner;

/**
 * 
 * @author HITESH
 *
 */
public class Code1TableOf {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Taking a Number from User Printing its Table and adding all
		 */
		int table = 0;
		int temp = 0;
		System.out.println("Please Enter the Number -> ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("\n<<<<Result>>>>");
		for (int i = 1; i <= 10; i++) {
			table = n * i;
			System.out.println(table);
			temp = temp + table;
		}
		System.out.println("Sum is " + temp);
		input.close();
	}
}