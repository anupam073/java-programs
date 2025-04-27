package Integer;

import java.util.Scanner;

public class pollindrome {

	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int originalnum = num;
		int rev =0;
		
		while(num !=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;	
			
		}
		
		if(originalnum==rev) {
			System.out.println("pollindrome");
		}else {
				System.out.println("not pollindome");
			}
			
	}
		
	}


