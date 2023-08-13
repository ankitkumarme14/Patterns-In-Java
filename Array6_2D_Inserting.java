package ArrayProblems;

import java.util.Scanner;

public class Array6_2D_Inserting {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Size of Row =");
		int n=scan.nextInt();
		System.out.println("Enter the Size of column =");
		int m=scan.nextInt();
		
	int[][] a= new int[n][m];
	
	System.out.println("Enter the elements of an Array = ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			a[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("Elements of an Array are = ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
		
	}

}
