package com.jigarnagar.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Jigar Nagar
 *
 *         Problem Statement :
 * 
 *         From a given array of natural numbers, return the distance between
 *         the two closest numbers.
 */
public class HEP4ClosestDistanceCheck {

	static int distClosestNumbers(int[] numbers) {
		int closeDistance = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			int checkPoint = numbers[i + 1] - numbers[i];

			if (closeDistance == 0)
				closeDistance = checkPoint;

			if (closeDistance > checkPoint) {
				closeDistance = checkPoint;
			}

		}

		return closeDistance;
	}

	static int[] sortedArray(int[] sortMe) {
		int length = sortMe.length;
		int temp = 0;
		// bubble sort
		for (int i = 0; i < length; i++) {

			for (int j = 1; j < length - i; j++) {
				if (sortMe[j - 1] > sortMe[j]) {
					temp = sortMe[j - 1];
					sortMe[j - 1] = sortMe[j];
					sortMe[j] = temp;
				}
			}

		}

		return sortMe;
	}

	public static void main(String[] args) {
		int[] testArray = { 3, 9, 50, 15, 99, 7, 98, 65 };
		int[] sortedArray = sortedArray(testArray);

		// Another Way to sort the array

		// System.out.println(l1);

		// Object[] sortedArray1 = l1.toArray();

		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(" " + sortedArray[i] + " ");
		}
		int result = distClosestNumbers(testArray);
		System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
	}

}
