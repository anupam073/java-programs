package String;

import java.util.Arrays;
import java.util.Scanner;

public class stringAnagram {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input1: ");

		String str1 = sc.nextLine();
		System.out.println("Enter input2: ");
		String str2 = sc.nextLine();

		char a[] = str1.toLowerCase().toCharArray();
		char b[] = str2.toLowerCase().toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("Both are anagram");

		} else {
			System.out.println("Not anagram");
		}

	}

}
