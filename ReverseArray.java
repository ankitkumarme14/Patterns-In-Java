package ArrayByApnaCollegeAlfa;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,12};
		reverseArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverseArray(int[] arr) {
		int firstIndex=0;
		int lastIndex=arr.length-1;
		
		while(firstIndex<lastIndex) {
			int temp=arr[lastIndex];
			arr[lastIndex]=arr[firstIndex];
			arr[firstIndex]=temp;
			firstIndex++;
			lastIndex--;
		}
		
	}
}
