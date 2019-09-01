import java.util.HashSet;

/*Given two arrays of integers, 
 * write a program to check if a pair of values (one value from each array) 
 * exists such that swapping the elements of the pair will make the sum of two arrays equal.
 * 
 * Solution - Take one of the arrays in a hashmap let's say arr2.
 * Traverse the first array. For each element check whether arr2-arr1-arr2[1] exists in arr2. If yes then print it.
 */

public class HashingSwapPairsEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {5,7,4,6};
		int[] arr2 = {1,2,3,8};
		swapPairs(arr1,arr2);

	}
	
	
	public static void swapPairs(int[] arr1, int[] arr2){
		
		int sum1 =0;
		int sum2=0;
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i=0;i< arr1.length;i++){
			sum1=sum1+arr1[i];
			
		}
		for(int i=0;i< arr2.length;i++){
			sum2=sum2+arr2[i];
			s.add(arr2[i]);
		}
		
		int diff = Math.abs(sum2-sum1);
		for(int i=0;i< arr1.length;i++){
			
			if(s.contains(diff-arr1[i])){
				
				System.out.println("Exchange " + arr1[i] + " from array1 and " + (diff-arr1[i]) + " from array2");
			}
			
		}
		
	}

}
