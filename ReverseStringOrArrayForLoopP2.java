package ArrayImpQuestions;

public class ReverseStringOrArrayForLoopP2{
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		String str = "Ankit";

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
