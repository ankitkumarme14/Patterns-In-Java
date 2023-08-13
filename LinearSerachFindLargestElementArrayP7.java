package ArrayImpQuestions;

public class LinearSerachFindLargestElementArrayP7{
	public static void main(String[] args) {
		int arr[] = { 45, 23, 13, 46, 68, 22, 49, 34, 21, 18};
		
		int larg=getLargest(arr);
		System.out.println("Largest element in Array ="+larg);
	}
	
	public static int getLargest(int arr[]) {
		
		int largest= Integer.MIN_VALUE; //-infinity
		
		for(int i=0; i<arr.length; i++) {
			
		if(largest<arr[i]) {
			
			largest=arr[i];
		}
		}
		return largest;
		
	}

}
