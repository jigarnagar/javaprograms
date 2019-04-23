package com.javaprogram.practice.scanner;

import java.util.Scanner;

/**
 * Program to read the value from Scanner
 * @author Jigar Nagar
 *
 */
public class ScannerPractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer Value : ");
		// Read the Integer Value
		int readInteger = scanner.nextInt();

		System.out.println("readInteger " + readInteger);

		// Whatever Integer Value entered by User , same number of integer need
		// to enter
		
		String [] strArry = new String[readInteger];
		System.out.println("Enter String Values "+readInteger+" times");
		for (int i = 0; i < readInteger; i++) {
			strArry[i] =scanner.next();
		}
		
		//Print all value which we stored in Array
		for (int i = 0; i < readInteger; i++) {
			System.out.println("strArry [ "+i+" ]"+strArry[i]);
		}
		
		// Read Float value
		System.out.println("Enter Float Value : ");
		float f = scanner.nextFloat();
		
		System.out.println("Float Value as "+f);
	}

}
