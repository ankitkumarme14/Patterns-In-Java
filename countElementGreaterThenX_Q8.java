package ArrayByPW;

import java.util.Scanner;

public class countElementGreaterThenX_Q8 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter the element of Array= ");
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the Number =");
		int x= scan.nextInt();
		
		int numberOfElement=countElement(arr, x);
		System.out.println("Number of element greater than x="+numberOfElement);
		
	}
	
	
	public static int countElement(int[] arr, int x) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<x) {
				count++;	
			}
		}
		return count;
		
	}

}
