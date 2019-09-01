import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Given an array of integers, Check if there exist four elements at different indexes in the array 
 * whose sum is equal to a given value k.
For example, if the given array is {1 5 1 0 6 0} and k = 7, then your function should print “YES” as (1+5+1+0=7).
 * 
 * Solution - This problem is similar to finding two elements in array that sum up to k.
 * We will follow similar approach, just instead of storing individual elements in hashmap. Store the combinations of
 * elements in the hashmap.
 * 
 * 
 */
public class ArrayFourSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 0, -1, 0, -2, 2};
		fourSum(arr,0);
	}

	
	public static void fourSum(int[] arr, int k){
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer> al;
		int sum=0;
		for(int i=0;i< arr.length;i++){
			
			for (int j=i+1;j<arr.length;j++){
				
				sum = arr[i] + arr[j];
				if(!m.containsKey(sum)){
					al = new ArrayList<Integer>();
					al.add(i);
					al.add(j);
					m.put(sum,al);
				}
				
				else {
					
					al = m.get(sum);
					al.add(i);
					al.add(j);
					m.put(sum,al);
				}
			}
		}
		
		System.out.println("The map is " + m);
		//Now finding all the pairs by traversing through the map.
		
		for(int i=0;i< arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(m.containsKey(k- (arr[i] + arr[j]))){
					
					al = m.get(k- (arr[i] + arr[j]));
					//System.out.println("The list is " + al);
					printElements(i,j,al,arr);
				}
			}
		}
		
	}
	
	public static void printElements(int i, int j,ArrayList<Integer> al,int[] arr){
		
		
		        int m=0;int n=1;
		        while(m<al.size() && n<al.size()){
				if(al.get(m) !=i && al.get(n)!=j){
					
					System.out.println("The elements are " + arr[i] + " " + arr[j] + " " + arr[al.get(m)] + " " + arr[al.get(n)]);
				}
				m=m+2;
				n=n+2;
			}
		}
		
	
}
