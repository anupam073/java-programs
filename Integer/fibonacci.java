package Integer;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want: ");
		int num = sc.nextInt();

		int first = 0;
		int second = 1;

		System.out.println(first);
		System.out.println(second);

		for (int i = 2; i < num; i++) {
			int next = first + second;
			System.out.println(next);
			first = second;
			second = next;
		}

	}
}
