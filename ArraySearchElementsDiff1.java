/*Search an element in an array such that max difference between two consecutive elements is 1 or -1
 * Solution - search the element in the first index. If found return else jump to k-arr[i]
 * 
 * 
 */
public class ArraySearchElementsDiff1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};
		search(arr,3);
		int[] arr1 = {1, 2, 3, 4, 5, 4};
		search(arr1,5);
	}

	
	public static void search (int[] arr, int k){
		
		int i=0;
		while(i < arr.length){
			if(arr[i] == k){
				
				System.out.println("Element found in " + i + " position");
				return;
			}
			
			i = i + Math.abs(arr[i]-k);
			
		}
		
		System.out.println("Element not found");
		return;
	}
}
