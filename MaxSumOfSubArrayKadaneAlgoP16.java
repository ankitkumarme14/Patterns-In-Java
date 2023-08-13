package ArrayImpQuestions;

public class MaxSumOfSubArrayKadaneAlgoP16 {
	public static void main(String[] args) {
		/*
		 *  Kadane algo  : sum is negative then it do equal to Zero.
		 *  
		 */
	
		int[] arr= {1,-2,6,-1,3};
		
		kadaneAlgoMaxSumOfSubArray(arr);
	}

	public static void kadaneAlgoMaxSumOfSubArray(int[] arr) {
		
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		
		for(int i=0; i<arr.length; i++) {
			currSum=currSum+arr[i];
			
			if(currSum<0) {
				currSum=0;
			}
			maxSum=Math.max(maxSum, currSum);
		}
		System.out.println("MAx sum of sub Array ="+maxSum);
	}
	
}
	
	
// misssing number in array

//	public static void main(String[] args) {
//		int[] arr= {1,2,3,5,6,7,8};
//		int n=arr.length;
//		rearrange(arr,n);
//	}
//	  static void rearrange(int arr[], int n) {
//	        // code here
//	        
//	        // sum of all element 
//	        int sum=((n+1)*(n+2))/2;
//	        
//	        for(int i=0; i<n; i++){
//	            sum=sum-arr[i];
//	        }
//	        
//	        System.out.print(sum);
//	    }
//}
