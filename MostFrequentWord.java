import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Given an array containing N words consisting of lowercase characters.
 *  Your task is to find the most frequent word in the array. 
 *  If multiple words have same frequency, then print the word that comes first in lexicographical order.
*/
public class MostFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"Siddharth","is","a","good","boy","right","Siddharth","right"};
		mostFrequentWord(arr);
	}

	
	
	public static void mostFrequentWord(String[] arr){
		
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i =0;i<arr.length;i++){
			
			if(m.containsKey(arr[i])){
				int value = m.get(arr[i]);
				value = value+1;
				m.put(arr[i],value);
			}
			
			else {
				
				m.put(arr[i],1);
			}
		}
		
		System.out.println(m);
		
		//now traversing the array and find the most frequent word
		String key =null;
		int val = 0;
        Iterator<Map.Entry<String,Integer>> itr = m.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Entry<String, Integer> entry = itr.next(); 
             if(key == null){
            	 
            	 key = entry.getKey();
            	 val = entry.getValue();
             }
             
             else {
            	 
            	 if(entry.getValue()>val){
            		 key = entry.getKey();
                	 val = entry.getValue(); 
            	 }
            	 
            	 else {
            		 
            		 if(entry.getKey().compareTo(key) > 0){
            			 key = entry.getKey();
                    	 val = entry.getValue();  
            		 }
            	 }
             }
        }
        System.out.println("Most frequent word is " + key);
        
        } 
	}

