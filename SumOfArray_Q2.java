package ArrayByPW;

public class SumOfArray_Q2 {
public static void main(String[] args) {
	int[] arr= {2,3,4,5,5,23,87};
	
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		sum+=arr[i];  //or sum= sum+arr[i];
	}
	System.out.println("Sum of array="+sum);
}
}
