package com.jigarnagar.hackerearth;

/**
 * 
 * @author Jigar Nagar
 *
 *         Bubble Sort Example
 * 
 *         20 12 15 18 34 52 41
 */
public class HEP3BubbleSort {

	public static void main(String[] args) {
		HEP3BubbleSort object = new HEP3BubbleSort();

		int[] arr = {3, 9, 50, 15, 99, 7, 98, 65};
		object.sortMyArray(arr);

		// for (int i = 0; i < arr1.length; i++)
		// System.out.println(arr1[i]);
	}

	public int[] sortMyArray(int[] unSortedArray) {

		int temp = 0;
		int length = unSortedArray.length;
		for (int i = 0; i < length; i++) {

			for (int j = 1; j < length - i; j++) {
				if (unSortedArray[j - 1] > unSortedArray[j]) {
					temp = unSortedArray[j - 1];
					unSortedArray[j - 1] = unSortedArray[j];
					unSortedArray[j] = temp;
				}
			}

		}
		for (int i = 0; i < unSortedArray.length; i++)
			System.out.println(unSortedArray[i]);
		return unSortedArray;
	}

}
