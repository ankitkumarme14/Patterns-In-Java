package ArrayProblems;

import java.util.Scanner;

public class Array5OddEven {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of an array = ");
		int n=scan.nextInt();
		
		int[] a= new int[n];
		
		System.out.println("Enter the elements of an array = ");
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();	
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("This element is Even ="+a[i]);
			}else {
				System.out.println("This element is Odd ="+a[i]);
			}
		}
	}

}
