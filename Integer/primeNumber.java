package Integer;

import java.util.Scanner;

public class primeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean isprime = false;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isprime = true;
				break;
			}

		}
		if (!isprime && num > 1) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
