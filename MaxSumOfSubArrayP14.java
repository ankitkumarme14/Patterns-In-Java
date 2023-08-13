package ArrayImpQuestions;

public class MaxSumOfSubArrayP14 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		
		maxSumSubArray(arr);
	}
		public static void maxSumSubArray(int[] arr) {
			int maxsum=Integer.MIN_VALUE;
			
			for(int i=0; i<arr.length; i++) {
				//int start=i;
				for(int j=i; j<arr.length; j++) {
					//int end=j;
					int sum=0;
					for(int k=i; k<=j; k++) {
						System.out.print(arr[k]+" ");
						sum=sum+arr[k];
					}
					System.out.print("sum ="+sum);
					if(sum>maxsum) {
						maxsum=sum;
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println("maximum sum of subArray="+maxsum);
		}
}
