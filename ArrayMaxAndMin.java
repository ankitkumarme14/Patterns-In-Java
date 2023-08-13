package ArrayImpQuestions;

// find max and min value from an array 
public class ArrayMaxAndMin {
	public static void main(String[] args) {
		int[] arr= {5,1,23,43,12,56,22};
		int maxNum=maxValue(arr);
		System.out.println("Max value from Array:"+maxNum);
	}
	
	public static int maxValue(int[] arr) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
}
