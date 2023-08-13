package ArrayByPW;

public class FindElementFromArray_Q4 {
	
	/*
	 * Linear search
	 */
	public static void main(String[] args) {
		int arr[] = {4,24,55,24,67,55,22};
		int element=55;
		
		int index=findElement(arr,element);
		
		if(index==-1) {
			System.out.println("Element is not present="+index);
		}else {
		System.out.println("Element is present at index="+index);
		}
	}
	
	public static int findElement(int[] arr, int element) {
		
		for(int i=0; i<arr.length; i++) {
			if(element==arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
