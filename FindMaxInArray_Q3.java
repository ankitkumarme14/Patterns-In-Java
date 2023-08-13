package ArrayByPW;

public class FindMaxInArray_Q3 {
	public static void main(String[] args) {
		int arr[] = {4,24,66,24,67,55,22};
		int element=maxElement(arr);
		System.out.println("Max element="+element);
		
	}
	
	public static int maxElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		return max;
		
	}

}
