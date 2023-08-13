package ArrayByPW;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndMinReturnArray_Q11 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of an Array=");
		
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the element of array=");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		int[] array=maxAndMin(arr);
		
		for(int i:array) {
			System.out.println(i);
		}
		
	}
	
	public static int[] maxAndMin(int[] arr) {	
		Arrays.sort(arr);
		
		int[] maxAndMinArray= {arr[0], arr[arr.length-1]};
	
//		int[] maxAndMinArray=new int[2];
//		maxAndMinArray[0]=arr[0];
//		maxAndMinArray[1]=arr[arr.length-1];
		
		return maxAndMinArray;
		
	}

}
