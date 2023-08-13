package ArrayImpQuestions;

public class LinearSearchFindIndexOfElementP5 {
	public static void main(String[] args) {
		int arr[] = { 45, 23, 13, 46, 68, 22, 49, 34, 21, 89 };
		int element = 34;

		int index = linearSearch(arr, element);

		if (index ==-1) {
			System.out.println("Element Not found.");
		} else {
			System.out.println("Element =" + element + " is present at index =" + index);
		}

	}

	public static int linearSearch(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;

	}
}
