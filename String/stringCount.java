package String;

import java.util.HashMap;
import java.util.Scanner;

public class stringCount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		
		HashMap< Character, Integer> frequency = new HashMap<>();
		
		for(char ch: input.toLowerCase().toCharArray()) {
			if(Character.isLetter(ch)) {
				frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
			}
		}
		
		for(char ch: frequency.keySet()) {
			System.out.println(ch+":"+frequency.get(ch));
			
		}



	}

}
