package ArrayImpQuestions;

public class BinarySearchFindElementP10 { // binary search use when list is sorted
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		int element = 10;
		int index = elementSerach(arr, element);

		if (index == -1) {
			System.out.println("Element is not Found");
		} else {
			System.out.println("Element is present at index =" + index);
		}
	}

	public static int elementSerach(int[] arr, int element) {
		int li = 0;
		int hi = arr.length-1;

		while (li <= hi) {
			int mid = (li + hi)/2;
			if (arr[mid] == element) {
				return mid;
			}
			if (arr[mid] > element) {
				hi = mid - 1;
			} else {
				li = mid + 1;
			}
		}
		return -1;
	}
}
