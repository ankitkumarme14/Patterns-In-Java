package ArrayProblems;

import java.util.Scanner;

public class Array4DeleteElement {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the size of an Array = ");
	int n=scan.nextInt();
	
	int[] a= new int[n];
	
	int[] b=new int[n-1];
	
	System.out.println("Enter the Elements of an Array =");

	//for taking the data
	for(int i=0; i<n; i++) {
		a[i]=scan.nextInt();	
	}
	System.out.println("Enter the index of element which want to delete = ");
	int num=scan.nextInt();
	
	// traversing the data
	for(int i=0; i<a.length; i++) {	
		
		//checking the index
		if(i<num) {
			b[i]=a[i];
			
		}else if(i==num) {
			continue;
		}else {
			b[i-1]=a[i];
		}
	}
	// printing the elements
	for(int i=0; i<b.length; i++) {
		System.out.println("Ater deleting the element = "+b[i]);
	}
	}

}
