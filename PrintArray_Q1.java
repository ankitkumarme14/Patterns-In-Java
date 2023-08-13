package ArrayByPW;

public class PrintArray_Q1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 5, 23, 87 };

		System.out.println(arr[4]);

		// By using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array Element=" + arr[i]);
		}

		// By using for each
		for (int i : arr) {
			System.out.println(i);
		}

		// By using while loop
		int i = 0;
		while (i < arr.length) {
			System.out.println("Array element By using while loop:" + arr[i]);
			i++;
		}

		// 2D array
		int[][] rd = { { 2, 3, 4, 5 }, { 6, 7, 8, 9 } };

		for (int s = 0; s < rd.length; s++) {
			for (int p = 0; p < rd[s].length; p++) {
				System.out.print("2D array elements=" + rd[s][p] + "   ");

			}
			System.out.println();

		}
	}
}