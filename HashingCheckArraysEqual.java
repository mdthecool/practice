import java.util.HashMap;

public class HashingCheckArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,5,4,0};
		int[] arr2 = {2,4,5,0,1};
		areEqual(arr1,arr2);

	}

	
	public static void areEqual(int[] arr1, int[] arr2){
		
		HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> m2 = new HashMap<Integer,Integer>();
		for(int i=0;i< arr1.length;i++){
			
			if(m1.containsKey(arr1[i])){
				
				int value = m1.get(arr1[i]);
				m1.put(arr1[i], value+1);
			}
			
			else {
				m1.put(arr1[i],1);
			}
		}
		
		for(int i=0;i<arr2.length;i++){
			
			if(m2.containsKey(arr2[i])){
				int value = m2.get(arr2[i]);
				m2.put(arr2[i],value+1);
			}
			else {
				
				m2.put(arr2[i],1);
			}
		}
		
		if(m1.equals(m2)){
			System.out.println("Both arrays are equal");
		}
		
		else {
			
			System.out.println("Arrays are not equal");
		}
	}
}
