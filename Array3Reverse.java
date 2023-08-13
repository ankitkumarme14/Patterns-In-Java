package ArrayProblems;

import java.util.Scanner;

public class Array3Reverse {

	public static void main(String[] args) {
		Scanner scan= new  Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n=scan.nextInt();
		
		int[] a= new int[n];
		
	//	int[] b= new int[n];
		System.out.println("Enter the elements in the Array =");
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
				
		for(int i=0; i<a.length; i++) {
		//	a[i]=a[i]*a[i];
			System.out.println("Elements of an array is ="+ a[i]);
			//System.out.println("squasre"+b[i]);
		}
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.println("Elements of an array is after reverse the array ="+ a[i]);
		}
		
	}
}


