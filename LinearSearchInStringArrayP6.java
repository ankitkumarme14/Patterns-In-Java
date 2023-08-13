package ArrayImpQuestions;

public class LinearSearchInStringArrayP6 {
	public static void main(String[] args) {
		String[] fruits = { "orange", "apple", "grapes", "banana", "mango" };
		String element = "banana";

		int index = linearSearch(fruits, element);
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("fruit is present at index =" + index);
		}
	}

	public static int linearSearch(String[] fruits, String element) {
		for (int i = 0; i < fruits.length; i++) {
			if (element.equals(fruits[i])) {
				return i;
			}
		}
		return -1;
	}
}
