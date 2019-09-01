import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,3,4,3,6,7,3};
		majorityElement(arr);

	}

	
	
	public static void majorityElement(int[] arr){
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(m.containsKey(arr[i])){
				
				int value = m.get(arr[i]);
				value = value+1;
				m.put(arr[i],value);
			}
			
			else {
				
				m.put(arr[i],1);
			}
		}
		
		//Traverse the hashmap
		Iterator<Map.Entry<Integer,Integer>> itr = m.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Entry<Integer, Integer> entry = itr.next(); 
             if(m.get(entry.getKey())>((arr.length)/2)){
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue());
             return;
             }
        } 
		System.out.println("No majority element");
		
	}
}
