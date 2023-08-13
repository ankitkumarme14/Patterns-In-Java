package ArrayImpQuestions;

public class RotatingArrayP1 {
	public static void main(String[] args) {
		/*
		 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2 Output: 3 4 5 6 7 1 2
		 * 
		 * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2 Output: 5 6 7 1 2 3 4
		 * 
		 * 
		 * Time Complexity:  O(n)
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int n = arr.length;

		rotate(arr, d, n);
		printArray(arr, n);

	}

	public static void rotate(int arr[], int d, int n) {

		// create temp store
		int temp[] = new int[n];
		int k = 0;

		// store the element from d to n-1 in temp[]
		for (int i = d; i < n; i++) {
			temp[k] = arr[i];
			k++;
		}

		// store first d elements from main arr[] to temp[]
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}

		// again back storing the temp[] into the main[]
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	public static void printArray(int[] arr, int n) {

		// printing the array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
