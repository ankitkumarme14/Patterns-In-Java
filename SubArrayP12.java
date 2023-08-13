package ArrayImpQuestions;

public class SubArrayP12 {
	public static void main(String[] args) {

		/*
		 * SubArray : Continues part of an array.
		 *    int[] arr = { 2, 4, 6, 8, 10 };
		 * 
		 * 2 
		 * 2 4 
		 * 2 4 6 
		 * 2 4 6 8 
		 * 2 4 6 8 10
		 * 
		 * 4 
		 * 4 6 
		 * 4 6 8 
		 * 4 6 8 10
		 * 
		 * 6 
		 * 6 8 
		 * 6 8 10
		 * 
		 * 8 
		 * 8 10
		 * 
		 * 10
		 * 
		 * 
		 * total number of subArrays= (n*(n+1))/2
		 * 
		 */

		int[] arr = { 2, 4, 6, 8, 10 };

		printSubArray(arr);

	}

	public static void printSubArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = start; j < arr.length; j++) {
				int end = j;
				for (int k = start; k <= end; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
