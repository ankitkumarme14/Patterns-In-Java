package ArrayByPW;

import java.util.Scanner;

public class LastOccurances_Q7 {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of Array=");
	
	int n= sc.nextInt();
	int[] arr=new int[n];
	
	System.out.println("Enter the element of array=");
	for(int i=0; i<n; i++) {
		arr[i]=sc.nextInt(); 

	}
	
	System.out.println("Enter the element which want to check last occurances index=");
	int element= sc.nextInt();
		
	int result=lastoccurances(arr, element);
	System.out.println("Last occurrance index= "+result);

}
	
	public static int lastoccurances(int[] arr, int element) {
		int index=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				index=i;
			}
		}
		return index;
		
	}
}