package String;

import java.util.Scanner;

public class stringReverse1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(original);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
        sc.close();
    }

}
