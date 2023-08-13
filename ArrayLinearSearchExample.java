package ArrayByApnaCollegeAlfa;

public class ArrayLinearSearchExample {
	public static void main(String[] args) {
		
	/* Linear Search : 
		 * 
		 * Q1 : find the index of element in given array
		 * 
		 *  {2,4,6,8,10,12,14,16}
		 *  element 10 index=?
	 */
		
//		int[] number= {2,4,6,8,10,12,14,16};
//		int element =11;
//		
//		 int foundIndex=linearSearch(number,element);
//		 
//		 if(foundIndex==-1) {
//			 System.out.println("Element Not Found");
//		 }else {
//			 System.out.println("Element present at Index :"+foundIndex);
//		 }
//	}
//	
//	public static int linearSearch(int []number, int element){
//		for(int i=0; i<number.length; i++) {
//			if(number[i]==element) {
//				return i;	
//			}
//		}
//		return -1;
//	}
	
	
	// Q2 : find the element is present or not
	 /*
	 *  {orange, apple, grapes, banana, mango}
	 *  element banana is present or not
	 */
	 
	String[] fruits={"orange", "apple", "grapes", "banana", "mango"};
	//String s= "banana";
	
	String f = linearSerach(fruits);
	System.out.println(f);
	
	
	}
	public static String linearSerach(String[] fruits) {
		for(int i=0; i<fruits.length; i++) {
		
			if(fruits[i].equals("banana")) {
				return "fruit is present.";
			}
		}
		return "fruit is not present.";
	}
	
}
