package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("enter " + size + " elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);

		}

	}

}
