package ArrayImpQuestions;

public class MaxSumOfSubArrayByPrifixSumApprochP15 {
	public static void main(String[] args) {
		/*
		 *  prefix sum: sum at i 
		 *  
		 */

	int[] arr= {1,-2,6,-1,3};
	
	maximumSum(arr);
	
	}
	
	public static void maximumSum(int[] arr) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		int[] prefix= new int[arr.length];
		prefix[0]=arr[0];
		
		// calculate prefix array
		for(int i=1; i<arr.length; i++) {
			prefix[i]=prefix[i-1]+ arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			int start=i;
			
			for(int j=i; j<arr.length; j++) {
				int end=j;
				currsum=start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
				
			if(maxsum<currsum) {
				maxsum=currsum;
				
			}
			}
			
		}
		System.out.println("Max sum ="+maxsum);
	}

}
