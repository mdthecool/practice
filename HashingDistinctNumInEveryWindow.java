import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*Given an array A[] of size N and an integer K. 
 * Your task is to complete the function countDistinct() which prints the count of distinct numbers in all windows 
 * of size k in the array A[].
 * 
 * Solution - Traverse the array and put the elements in the hashset. When the count reaches 4 , check the hashset size.
 * Hashset size is the distinct chracters. ****Now when you traverse the next element remove the first one from the hashset.
 * 
 * 
 */
public class HashingDistinctNumInEveryWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 1, 3, 4, 2, 3};
		int k=4;
		distinct(arr,k);

	}
	
	public static void distinct(int[] arr, int k){
		
		HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
		int beg=0;
		if(k>arr.length){
			return;
		}
		
		for(int i=0;i<k;i++){
			
			if(!s.containsKey(arr[i])){
			s.put(arr[i],1);
			}
			
			else {
				int value = s.get(arr[i]);
				value = value +1;
				s.put(arr[i],value);
			}
			
		}
		System.out.println("Distinct elements-" + s.size() + " " + s);
		for(int i=k;i< arr.length;i++){
			
			if(s.get(arr[beg])> 1){
				
				int value = s.get(arr[beg]);
				value = value -1;
				s.put(arr[beg], value);
			}
			else {
			s.remove(arr[beg]);
			}
			if(s.containsKey(arr[i])){
				int value = s.get(arr[i]);
				value = value +1;
				s.put(arr[i],value);
			}
			else {
			s.put(arr[i],1);
			}
			beg++;
			System.out.println("Distinct elements-" + s.size() +" " + s);
			
			}
			
			
		}
	}


