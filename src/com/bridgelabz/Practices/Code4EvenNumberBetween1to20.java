package com.bridgelabz.Practices;
/**
 * 
 * @author HITESH
 *
 */
public class Code4EvenNumberBetween1to20 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Printing Even Number between 1 to 20
		 */
		int i;
		for (i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}