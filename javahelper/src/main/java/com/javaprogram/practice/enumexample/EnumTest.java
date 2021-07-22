package com.javaprogram.practice.enumexample;

/**
 * 
 * @author jigar
 *
 */
enum DESIGN_PATTERN {

	CREATIONAL_DP("CREATIONAL", 5), BEHAVIORALL_DP("BEHAVIORAL", 8), STRUCTURAL_DP("STRUCTURAL", 12);

	String name;
	int numberOfCount;

	DESIGN_PATTERN(String string, int i) {

		this.name = string;
		this.numberOfCount = i;

	}

	public String getName() {
		return name;
	}

	public int getNumberOfCount() {
		return numberOfCount;
	}

}

/**
 * 
 * @author jigar
 *
 */
public class EnumTest {

	public static void main(String[] args) {

		for (DESIGN_PATTERN s : DESIGN_PATTERN.values()) {
			System.out.println(s.name + " COUNT " + s.getNumberOfCount() +" POSITION "+s.ordinal());
		}

	}

}
