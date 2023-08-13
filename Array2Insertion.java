package ArrayProblems;

import java.util.Scanner;

public class Array2Insertion {

	public static void main(String[] args) {
		Scanner scan= new  Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n=scan.nextInt();
		
		int[] a= new int[n];
		
		int[] b= new int[n+1];
		
		System.out.println("Enter the elements in the Array =");
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter the index for inserting new element = ");
		int m= scan.nextInt();
		
		System.out.println("Enter the new index element = ");
		int p=scan.nextInt();
		
		for(int i=0; i<n+1; i++) {
			
			if(i<m) {
				b[i]=a[i];
				
			}else if(i==m) {
				b[i]=p;
				
			}else {
				b[i]=a[i-1];
			}
		}
				
		for(int i=0; i<b.length; i++) {
			System.out.println("Elements of an array is ="+ b[i]);
		}
	}
}
