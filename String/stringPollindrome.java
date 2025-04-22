package String;

import java.util.Scanner;

public class stringPollindrome {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		String reversed = sb.reverse().toString();
		if(input.equals(reversed)) {
			System.out.println(input+"="+reversed);
		}
		else {
			System.out.println(input+"≠"+reversed);
		}
	
	}

}
