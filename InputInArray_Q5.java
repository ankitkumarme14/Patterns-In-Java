package ArrayByPW;

import java.util.Scanner;

public class InputInArray_Q5 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int n= scan.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the elment of array=");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Elements of array=");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
