package com.jigarnagar.hackerearth;

import java.util.Scanner;

/**
 * 
 * @author Jigar Nagar
 * 
 *         Problem Statement
 * 
 *         Write a program to transform strings of lowercase alphabet characters
 *         by replacing each letter with the subsequent character in the english
 *         alphabet. Input : hello
 * 
 * 
 *         Output : ifmmp
 *
 */
public class HackerEarthProblem2 {

	public static void main(String[] args) {

		Scanner readScanner = new Scanner(System.in);
		System.out.println("Enter the text :- ");
		String readValueFromScanner = readScanner.nextLine();
		int length = readValueFromScanner.length();

		StringBuilder newStringValue = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int assci = readValueFromScanner.charAt(i);
			char nextChar = (char) (assci + 1);
			newStringValue.append(nextChar);
		}

		System.out.println("Output " + newStringValue.toString());
		readScanner.close();

	}

}
