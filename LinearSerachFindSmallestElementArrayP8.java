package ArrayImpQuestions;

public class LinearSerachFindSmallestElementArrayP8 {
	public static void main(String[] args) {
		int arr[] = { 45, 23, 13, 46, 68, 22, 49, 34, 21, 18};
		
		int small=getSmallest(arr);
		System.out.println("Smallest number="+small);
	}
 public static int getSmallest(int[] arr) {
	 int smallest= Integer.MAX_VALUE;
	 
	 for(int i=0; i<arr.length; i++) {
		 if(smallest> arr[i]) {
			 smallest=arr[i]; 
		 }
	 }
	 return smallest;
	 
 }
}
