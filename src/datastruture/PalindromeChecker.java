package datastruture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PalindromeChecker {
	/**
	 * PROCEDURE
	 * ===================================================
	 * 1. created scanner calss to take input
	 * 2.taking a queue to store a reversed string
	 * 3.reversing a user input string
	 * 4. checking user input with reverse string
	 * ====================================================
	 */

	/*
	 *1. created scanner calss to take input 
	 */
	static final Scanner in = new Scanner(System.in);
	/*
	 * 2.taking a queue to store a reversed string
	 */
	static Queue<Character> queue = new LinkedList<>();

	public static void main(String[] args) {

		System.out.print("Enter string to check Palindrome or not : ");
		String inputString = in.next();

		/*
		 * 3.reversing a user input string
		 */
		for (int i = inputString.length() - 1; i >= 0; i--) {
			queue.add(inputString.charAt(i));
		}

		String reverseString = "";

		/*
		 *4. checking user input with reverse string
		 */
		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (inputString.equals(reverseString))
			System.out.println("The input is a palindrome.");
		else
			System.out.println("The input not a palindrome.");

	}
}