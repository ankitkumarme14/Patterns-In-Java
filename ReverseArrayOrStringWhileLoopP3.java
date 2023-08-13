package ArrayImpQuestions;

import java.util.Scanner;

public class ReverseArrayOrStringWhileLoopP3 {
//	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3};
//
//		reverse(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//
//	public static void reverse(int[] arr) {
//		int start = 0;
//		int end = arr.length - 1;
//		int temp;
//
//		while (start <= end) {
//			temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//		}
//	}
//}




	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter ");
	int t=scan.nextInt();
	int[] a=new int[t];
	for(int i=0; i<a.length; i++){
	    a[i]=scan.nextInt();
	}
	
	reverseArray(a);
	printArray(a);
	
//	for(int i:a){
//	   System.out.print(i+" "); 
//	}
	}
	
	public static void reverseArray(int[] a){
	    int start=0;
	    int end=a.length-1;
	    int temp=0;
	    
	    while(start<end){
	        temp=a[start];
	        a[start]=a[end];
	        a[end]=temp;
	        start++;
	        end--;
	    }
	    
	}
	
 	public static void printArray(int[] a){
 	    for(int i=0; i<a.length; i++){
 	         System.out.print(a[i]+" "); 
 	    }
 	}
}