package com.secondlabtwo.java;

public class Main {

	public static void countCurrency(int amount) {
		int[] notes = new int[] { 78, 60, 25, 12, 5 };
		int[] noteCounter = new int[5];

		for (int i = 0; i < 5; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}

		System.out.println("Currency Count ->");

		for (int i = 0; i < 5; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);

			}
		}
	}

	public static void main(String argc[]) {
		int amount = 128;
		countCurrency(amount);
	}

}
