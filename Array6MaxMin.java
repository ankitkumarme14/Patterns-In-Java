package ArrayProblems;

import java.util.Scanner;

public class Array6MaxMin {

	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the size of Array = ");
//		int n=scan.nextInt();
//		int[] a= new int[n];
//		
//		System.out.println("Enter the Elements = ");
//		for(int i=0; i<n; i++) {
//		a[i]=scan.nextInt();	
//		}
//		
		
		    int[] a= {10,20,30,40,50,60};	
		
			System.out.println("Min value from sorted array = "+a[0]);
			System.out.println("Max value from sorted array = "+a[a.length-1]);
			
			System.out.println("sum of max and min values from an array = "+(a[0]+a[a.length-1]));
			
			System.out.println("2nd Min value from sorted array = "+a[1]);
			System.out.println("2nd Max value from sorted array = "+a[a.length-2]);
			
			// sum of an Array elements 
			int sum=0;
			for(int i=0; i<a.length; i++) {
				sum= sum+a[i];		
			}
			System.out.println("sum of an array elements = "+sum);
			
//			int count=0;
//			int b[] =new int[a.length];
//			for(int i=0; i<a.length-1; i++) {
//				if(a[i]==a[i+1]) {
//					count++;
//				}else {
//					b[i]=a[i];
//				}
//				System.out.println(b[i]);
//			}
//			
		}
	}


