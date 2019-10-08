package com.tubz;

public class FizzBuzz {

	public static void main(String[] args) {

		printFizzBuzz(100);
	}

	private static void printFizzBuzz(int i) {
		for (int j = 1; j <= 100; j++) {
			if ((j % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (j % 3 == 0) {
				System.out.println("Fizz");
			} else if (j % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(j);
			}
		}
	}

}
