package com.jigarnagar.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Jigar Nagar
 * 
 *         Problem Statement
 * 
 *         Given a string, say sentence=" this is crazy and fun" and a list, say
 *         name=["is", "fun"]. Now you need to capitalize on the first letter of
 *         every word in the given string which is not present in the list.
 * 
 *         Input : this is crazy and fun
 * 
 * 
 *         Output : this Is crazy and Fun
 *
 */
public class HackerEarthProblem1 {

	public static void main(String[] args) {

		Scanner inputValue = new Scanner(System.in);

		System.out.println("Enter the sentence :- ");
		String sentence = inputValue.nextLine();

		System.out.println("How many word do you need to make capitalized ");
		int count = inputValue.nextInt();

		List<String> makeMeCapital = new ArrayList<>();

		System.out.println("Please enter word now one after another");

		for (int i = 0; i < count; i++) {
			makeMeCapital.add(inputValue.next());
		}

		String[] sentenceInArray = sentence.split(" ");
		StringBuilder myNewSentence = new StringBuilder();
		for (String str : sentenceInArray) {
			if (makeMeCapital.contains(str)) {
				String firstLetter = str.substring(0, 1);
				String remainingLetter = str.substring(1);
				str = firstLetter.toUpperCase() + remainingLetter;
			}
			myNewSentence.append(str);
			myNewSentence.append(" ");
		}

		System.out.println("Final Output:- " + myNewSentence.toString());
		inputValue.close();

	}

}
