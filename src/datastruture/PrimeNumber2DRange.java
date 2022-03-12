package datastruture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class PrimeNumber2DRange {
	
	/**
	 * procedure
	 * ===================================================
	 * 1.checking wheather prime numer or not
	 *  2.creating object of class
	 * 3.variable assgin
	 * 4.storing 2d array form
	 * 5.printing prime number in range
	 * 6. creating agroup of 100 to print prime number
	 * =====================================================
	 */
	/*
	 * 1.checking wheather prime numer or not
	 */
	public boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * 2.creating object of class
		 */
		PrimeNumber2DRange primeNumber2D = new PrimeNumber2DRange();
		
		/*
		 * 3.variable assgin
		 */
		int start = 0, end = 100, arraySize = 0;
		List<Integer> primeList;
		/*
		 * 4.storing 2d array form
		 */
		Integer[][] primeNumber = new Integer[10][];
		
		for (int i = 0; i < 10; i++) {
			primeList = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				if (primeNumber2D.isPrime(j)) {
					primeList.add(j);
					arraySize++;
				}
			}
			/*
			 * 5.printing prime number in range
			 */
			primeNumber[i] = primeList.toArray(new Integer[arraySize]);
			System.out.println(primeNumber[i].length);
			for (Integer item : primeNumber[i]) {
				System.out.print(item + "  ");
			}
			System.out.println("\n");
			/*
			 *6. creating agroup of 100 to print prime number
			 */
			start = end + 1;
			end += 100;
			arraySize = 0;
		}
	}
}