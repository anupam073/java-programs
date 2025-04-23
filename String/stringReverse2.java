package String;

import java.util.Scanner;

public class stringReverse2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String rev = "";
		char [] chars = str.toCharArray();
		for (int i=chars.length-1; i>=0; i--) {
			rev = rev+chars[i];
			
			}
		System.out.println(rev);
		}

}
