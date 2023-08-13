package ArrayProblems;

import java.util.Scanner;

public class Array1Insertion {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the size of an Array = ");
	int n=scan.nextInt();
	
	int[] a= new int[n];
	System.out.println("Enter the array elements= ");
	
	// for take the data from the user
	for(int i=0; i<n; i++) {
		a[i]=scan.nextInt(); //a[0],a[1],a[2],a[3],a[4]
	}
	
	// printing the elements of an array by for loop
	for(int i=0; i<a.length; i++) {
		System.out.println("Elements of an array is = "+a[i]);
	}
	
	// printing the elements of an array by for each loop
	for(int i :a) {
		System.out.println("Elements of an array is = "+i);
	}
	}
}
