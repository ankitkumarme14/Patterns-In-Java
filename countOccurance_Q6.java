package ArrayByPW;

import java.util.Scanner;

public class countOccurance_Q6 {
	/*
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int n=scan.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the element of an array=");
		
		for(int i=0; i<n; i++) {
			arr[i]= scan.nextInt();
		}
		
		System.out.println("Enter the element which want to check occurances=");
		int element=scan.nextInt();
		int result=maxOccurance(arr, element);
		System.out.println("occurrances="+result);
	}
	
	
	public static int maxOccurance(int[] arr, int element) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				count++;	
			}
			
		}
		return count;
	}
	
}
