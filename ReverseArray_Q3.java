package Arraygkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray_Q3 {

	public static void main(String[] args) {
		/*
		 *    	Input  : arr[] = {1, 2, 3}
              	Output : arr[] = {3, 2, 1}

				Input :  arr[] = {4, 5, 1, 2}
				Output : arr[] = {2, 1, 5, 4}
		 * 
		 */

		int arr[] = {1, 2, 3};
		
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
		
//		reverse( arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		
		int start=0;
		int end=arr.length-1;
		reverseArray(arr, start, end);
		System.out.println("Reverse array:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	// 1 Method 
	public static void reverse(int[] arr) {
		int temp;
		for(int i=0; i<arr.length/2; i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	
	// 2 Method 
	public static void reverseArray(int[] arr, int start, int end) {
		
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
