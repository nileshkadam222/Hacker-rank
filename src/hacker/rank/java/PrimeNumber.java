package hacker.rank.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfIteration = scan.nextInt();
		for (int i = 0; i < numberOfIteration; i++) {
			int val = scan.nextInt();
			for (int j = 2; j < val / 2; j++) {
				if (val % j == 0)
					val = 1;
			}
			if (val == 1)
				System.out.println("Not prime");
			else
				System.out.println("Prime");
		}

	}

}
