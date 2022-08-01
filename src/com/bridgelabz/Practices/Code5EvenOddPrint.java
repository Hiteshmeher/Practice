package com.bridgelabz.Practices;

/**
 * 
 * @author HITESH
 *
 */
public class Code5EvenOddPrint {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Printing Odd and Even Number in Sequence Manner
		 * printing sum for odd and Even
		 */
		int m = 1, n = 1;
		int OddSum = 0, EvenSum = 0;
		System.out.println("Odd    Even \n");
		for (int i = 1; i < 20; i++) {
			if (i % 2 != 0) {
				m = i;
				OddSum += m;
				n = m + 1;
				EvenSum += n;
				System.out.println(m + "\t" + n);
			}
		}
		System.out.println("\nTotal   Total");
		System.out.println(OddSum + "\t" + EvenSum);
	}
}