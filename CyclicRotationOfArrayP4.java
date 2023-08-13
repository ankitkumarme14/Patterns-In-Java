package ArrayImpQuestions;

public class CyclicRotationOfArrayP4{
	public static void main(String[] args) {
		/*
		 *    Input:  arr[] = {1, 2, 3, 4, 5}
		 *    Output: arr[] = {5, 1, 2, 3, 4}
		 */
		
		int arr[]= {1,2,3,4,5};
		cyclicRotation(arr);
		//printArray(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}
	
	
	public static void cyclicRotation(int arr[]) {
		
		// store the last element of an array in variable x
		int x= arr[arr.length-1];   // 5=arr[5-1]
		
		// shift the all element by one
		for(int i=arr.length-1; i>0; i--) {   //5-1=4 3 2 1
			arr[i]=arr[i-1];         //3 ka 4 may,  2 ka 3 may, 1 ka 2 may 0 ka 1	
		}
		
		// replace the first element of array with x
		arr[0]=x;
	}
	
	// print the array
//	public static void printArray(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
	

}
