package ArrayByPW;

import java.util.Scanner;

public class CheckArrayIsSortedOrNot_Q9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int n = scan.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the element of array=");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		boolean result = checkArray(arr);

		if (result == true) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted.");
		}

	}

	public static boolean checkArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}

		return true;
	}

}
