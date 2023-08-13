package Arraygkg;

import java.util.Arrays;

public class MaxMinArray_Q2 {

	public static void main(String[] args) {
		
		        /*
		         *   N = 6
				     A[] = {3, 2, 1, 56, 10000, 167}
				     Output:
				     min = 1, max =  10000
		         */
		
		int arr[]= {3, 2, 1, 56, 10000, 167};
		int n= arr.length;
//		System.out.println("Max value :"+max(arr,n));
//		System.out.println("Min value :"+min(arr,n));
		
		Arrays.sort(arr);
		System.out.println("Min value:"+arr[0]);
		System.out.println("Max value:"+arr[n-1]);
	}
	
//	public static int max(int arr[], int n) {
//		int maxValue=Integer.MIN_VALUE; //- infinity
//		for(int i=0; i<arr.length; i++) {
//			if(maxValue<arr[i]) {
//				maxValue=arr[i];
//			}
//		}
//		return maxValue;
//	}
//
//	
//	public static int min(int arr[], int n) {
//		int minValue= Integer.MAX_VALUE;  // + infinity
//		for(int i=0; i<arr.length; i++) {
//			if(minValue>arr[i]) {
//				minValue=arr[i];
//			}
//			
//		}
//		return minValue;
//	}
}
