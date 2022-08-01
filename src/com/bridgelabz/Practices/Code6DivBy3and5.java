package com.bridgelabz.Practices;
/**
 * 
 * @author HITESH
 *
 */
public class Code6DivBy3and5 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Printing Numbers which are divisible by both 3 and 5 between 1 to 50
		 */
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}