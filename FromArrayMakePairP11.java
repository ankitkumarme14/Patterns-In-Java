package ArrayImpQuestions;

public class FromArrayMakePairP11 {
	/*
	 * 
	 * Total pairs=(n*(n-1))/2
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10};
		pairCreate(arr);
	}
	public static void pairCreate(int[] arr) {
		int totalPairs=0;
		//int n=arr.length;
		//int Totalpairs=(n*(n-1))/2;
		
		for(int i=0; i<arr.length; i++) {
			int curr= arr[i];
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("("+curr+","+arr[j]+")");
				totalPairs++;
			}
			System.out.println();
		}
		System.out.println("Total pairs="+totalPairs);
		//System.out.println("Total pairs="+Totalpairs);
	}
}
