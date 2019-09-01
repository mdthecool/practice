import java.util.ArrayList;
import java.util.HashMap;

/*Given an array, print all subarrays in the array which has sum 0.
 * Solution = Traverse the array and find the sum till that element. Check if the sum is in the hashmap or not.
 * If not , then push to hashmap. If the sum already exists in the hashmap that means we have enountered an array with 0 sum.
 * 
 * 
 */
public class HashingSubArrays0Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {6, 3, -1, -3, 4, -2, 2,4, 6, -12, -7};
		subArray0Sum(arr);
	}
	
	
	public static void subArray0Sum(int[] arr){
		
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer> al ;
		int sum =0;
		for(int i=0;i<arr.length;i++){
			
			sum = sum + arr[i];
			if(!m.containsKey(sum)){
				al = new ArrayList<Integer>();
				al.add(i);
				m.put(sum,al);
				
			}
			
			else {
				
				al = m.get(sum);
				al.add(i);
				m.put(sum,al);
			}
		}
		
		System.out.println("The hashmap is " + m);
		
		//Now traverse the hashmap and print all the sub arrays with 0 sum.
		//The hashmap is {0=[10], 19=[8], 5=[3], 6=[0], 7=[5, 9], 8=[2], 9=[1, 4, 6], 13=[7]}
		
		
		
		
	}

}
