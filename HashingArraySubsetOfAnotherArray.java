import java.util.HashMap;

/*Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n. 
 * Task is to check whether arr2[] is a subset of arr1[] or not. 
 * Both the arrays can be both unsorted or sorted. 
 * It may be assumed that elements in both array are distinct.
 * 
 * Solution = Traverse the first array and put the elements of it in a hashmap.
 * Now traverse the 2nd array and decrease the value count.
 * If the value count <0 or any element not found then return 0 else return 1.
 * 
 * 
 * 
 */
public class HashingArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,5,2,23,19};
		int [] arr2 = {19,5,3};
		isSubsetArray(arr1,arr2);
	}

	
	public static void isSubsetArray(int[] arr1, int[] arr2){
		
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i =0; i < arr1.length;i++){
			
			if(m.containsKey(arr1[i])){
				int value = m.get(arr1[i]);
				value = value+1;
				m.put(arr1[i], value);
			}
			
			else {
				
				m.put(arr1[i],1);
			}
		}
		
		for(int i=0;i<arr2.length;i++){
			if(!m.containsKey(arr2[i])){
				System.out.println("Not a subset");
				return;
			}
			
			else {
				if(m.get(arr2[i])==0){
					System.out.println("Not a subset");
					return;
				}
				
				int value = m.get(arr2[i]);
				value = value-1;
				m.put(arr2[i], value);
			}
		}
		
		System.out.println("Is a subset");
		return;
	}
}
