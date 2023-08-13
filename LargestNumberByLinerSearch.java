package ArrayByApnaCollegeAlfa;

public class LargestNumberByLinerSearch {
	public static void main(String[] args) {
		
		int[] arr= {45,66,24,98,55,44,78};
		
		int large=largestValue(arr);
		System.out.println("Largest value : "+large);
	}
	
	public static int largestValue(int[] arr) {
		
		int largest=Integer.MIN_VALUE; //negative infinite
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
		
	}

}
