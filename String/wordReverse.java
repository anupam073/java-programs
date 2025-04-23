package String;

import java.util.Scanner;

public class wordReverse {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String rev = "";
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {

			rev = rev + words[i] + " ";

		}
		System.out.println(rev.trim());

	}

}
