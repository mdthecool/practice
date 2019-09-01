import java.util.HashMap;

/*Given an array of integers and a number k, 
 * write a function that returns true if given array can be 
 * divided into pairs such that sum of every pair is divisible by k.
 * 
 * 
 * 
 */
public class HashingArrayDivisblePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,7,5,3};
		pairs(arr,6);

	}

	
	public static void pairs(int[] arr, int k){
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		//constructing the map.
		for(int i=0;i< arr.length;i++){
			
			if(m.containsKey(arr[i]%k)){
				
				int value = m.get(arr[i]%k);
				value = value +1;
				m.put(arr[i]%k, value);
			}
			else {
				
				m.put(arr[i]%k,1);
			}
		}
		System.out.println(m);
		for(int i=0;i< arr.length;i++){
			
			
			int rem = arr[i]%k;
			if(m.containsKey(k-rem)){
				
				if(rem == (k-rem)){
					int value = m.get(k-rem);
					if(value%2 !=0){
						
						System.out.println("No pair found");
						return;
					}
				}
					else if(rem==0){
						
					   int  value = m.get(k-rem);
						if(value%2 !=0){
							
							System.out.println("No pair found");
							return;
						}
					}
					
					else {
						
						int value1 = m.get(k-rem);
						int value2 = m.get(rem);
						if((value1 !=value2)){
							System.out.println("No pair found");
							return;
						}
					}
			
			
		}
			
			else {
				
				System.out.println("No pair found");
				return;
			}
	}
		
		System.out.println("Pair exist");
	}
	
}
