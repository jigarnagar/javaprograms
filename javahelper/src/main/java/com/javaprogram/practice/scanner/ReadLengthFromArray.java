package com.javaprogram.practice.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Pass the String value and program will provide output of passed string length
 * 
 * @author jigar nagar
 *
 */
public class ReadLengthFromArray {

	public static void main(String[] args) {

		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Enter Input Array in String format:- ");

		List<String> nameObject = new ArrayList<>();

		while (scannerObj.hasNextLine()) {
			nameObject.add(scannerObj.nextLine());
		}

		List<Integer> nameObjectLength = new ArrayList<>();

		for (String itrObject : nameObject) {

			nameObjectLength.add(itrObject.length());
		}

		System.out.println("Length of pass object is : --->" + nameObjectLength);

		scannerObj.close();
	}

}
