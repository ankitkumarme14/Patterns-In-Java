package ArrayByApnaCollegeAlfa;

public class SmallestAndLargestByLinearSearch {
	public static void main(String[] args) {
		int[] arr= {45,66,24,98,55,44,78};
		
		int sm=smallest(arr);
		System.out.println("Smallest number : "+sm);

	}
	public static int smallest(int arr[]) {
		int smallest=Integer.MAX_VALUE; // + infinity
		//int largest=Integer.MIN_VALUE;
		for(int i= 0; i<arr.length; i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			
//			if(largest<arr[i]) {
//				largest=arr[i];
//			}
		}
		//System.out.println("Largest value : "+largest);
		return smallest;	
	}
}
