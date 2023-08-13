package ArrayImpQuestions;

public class LinearSerachFindSmallesAndLargesttElementArrayP9 {
	public static void main(String[] args) {
		int arr[] = { 45, 23, 13, 46, 68, 22, 49, 34, 21, 18 };
		int large = getLargest(arr);
		int small = getSmallest(arr);
		System.out.println("smallest element in array =" + small);
		System.out.println("largest element in array =" + large);

	}

	public static int getLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static int getSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
}
