package ArrayByPW;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByUsingArrayMethod_Q10 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of an Arraly=");
		int  n=scan.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the element of an array=");
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		
		sortArray(arr);
	}
	
	public static void sortArray(int[] arr) {
	Arrays.sort(arr);
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
