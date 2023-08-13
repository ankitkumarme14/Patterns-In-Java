package ArrayByApnaCollegeAlfa;

public class BinarySearchFindElement {
	public static void main(String[] args) {
		/*
		 * Binary Search :
		 * Note 1. :- list is sorted in ascending or descending order
		 * 2. Mid=(Li+Hi)/2;
		 * 
		 * 3. O(logn)   --> time complexcity
		 */
		
		// Q1 : find the elements from the list
		
		int[] arr = {2,4,6,8,10,12,14};
		int search=10;
		 int result=binarySerach(arr,search);
		 System.out.println("Element index :"+result);
	}
	
	public static int binarySerach(int[] arr,int search) {
		
		int li=0;
		int hi=arr.length-1;
		
		while(li<=hi) {
			int mid=(li+hi)/2;
			if(arr[mid]==search) {
				return mid;
			}else if(search>arr[mid]) {
				li=mid+1;
			}else {
				hi=mid-1;
			}	
		}
		return -1;	// when element not found or li >hi
	}

}
