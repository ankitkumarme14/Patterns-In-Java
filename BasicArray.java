package ArrayByApnaCollegeAlfa;

import java.util.Scanner;

public class BasicArray {
	/*
	 * Array : Array is List of elements of same type. place in a continuous memory
	 * allocation.
	 * 
	 * 
	 */
	public static void main(String[] args) {

     // Q1: Input and output 
	 /* Scanner scan = new Scanner(System.in);
		int[] marks = new int[100];
		System.out.println("Enter the Marks :");
		marks[0] = scan.nextInt();
		marks[1] = scan.nextInt();
		marks[2] = scan.nextInt();

		System.out.println("Phy :" + marks[0]);
		System.out.println("Chem :" + marks[1]);
		System.out.println("Math :" + marks[2]);
      */
		
     // Q2: Input and output and update the value than print
	 /* Scanner scann = new Scanner(System.in);
		int[] marks1 = new int[100];
		System.out.println("Enter the Marks :");
		marks1[0] = scann.nextInt();
		marks1[1] = scann.nextInt();
		marks1[2] = scann.nextInt();

		System.out.println("Phy : " + marks1[0]);
		System.out.println("Chem : " + marks1[1]);
		System.out.println("Math : " + marks1[2]);
		
		// After Update marks
		marks1[2]=marks1[2]+4;
		marks1[0]=marks1[0]-2;
		
		System.out.println("Phy marks After Update : " + marks1[0]);
		System.out.println("Chem marks After Update : " + marks1[1]);
		System.out.println("Math marks After Update : " + marks1[2]);
		*/
		
	// Q3: Input and output print the percentage
	/*  Scanner scann = new Scanner(System.in);
	    int[] marks1 = new int[100];
	    System.out.println("Enter the Marks :");
		marks1[0] = scann.nextInt();
		marks1[1] = scann.nextInt();
		marks1[2] = scann.nextInt();

		System.out.println("Phy : " + marks1[0]);
		System.out.println("Chem : " + marks1[1]);
		System.out.println("Math : " + marks1[2]);
			
		int percentage=(marks1[0]+marks1[1]+marks1[2])/3;
		System.out.println("Percentage of marks :"+percentage +"%");
		*/	
		
	// Q4: find the length of an array
	/*  int[] marks1 = new int[100];
	    
	    System.out.println("Length of an array : "+marks1.length);
		*/
		
	// Q5: update the each elements and print them  {***}
		int[] marks= {56,34,57,89,23};
		update(marks);
		
		// print the marks
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	}
	// update the marks
	public static void update(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			marks[i]= marks[i]+5;
		}	
	}

}
