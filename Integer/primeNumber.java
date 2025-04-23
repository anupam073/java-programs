package Integer;

import java.util.Scanner;

public class primeNumber {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to Check: ");
		int num = sc.nextInt();
		boolean isprime = true;
		
		if (num<=1) {
			isprime=false;
		}
		isprime=true;
		for(int i =2; i<=Math.sqrt(num); i++) {
			if(num%i ==0) {
				isprime= false;
				break;
				
			}
		}
		
		if(isprime) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}

}
