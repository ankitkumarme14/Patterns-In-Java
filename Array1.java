package ArrayProblems;

public class Array1 {

	public static void main(String[] args) {
		int[] a= {10,21,30,40,50};
		
		// print the element by index number
		System.out.println("Print the array element by index number num= "+a[0]);
		System.out.println("Print the array element by index number num= "+a[4]);
		
		// size of an array
		System.out.println("Size of the Array is = "+a.length);
		
		// check the number is even at given index number
		if(a[1]%2==0) {
			System.out.println("number is even at given index number ");
		}else {
			System.out.println("number is not even at given index number ");
		}

	}

}
