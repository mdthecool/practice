import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Given an array of integers. Sort the array by frequency. If two integers have the same frequency in the array
 * put the element coming first in the original array.
 * Solution - Put the element in a HashMap with key as the frequency and value as the array element.
 * Note the value must be an arraylist.
 * 
 * 
 * 
 */
public class SortByFrequency implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
		sortByFrequency(arr);
	}
	
	
	public static void sortByFrequency(int[] arr){
		
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> pos = new HashMap<Integer,Integer>();
	
		
		for(int i=0;i< arr.length;i++){
			
			if(!m.containsKey(arr[i])){
				
				m.put(arr[i],1);
				pos.put(arr[i],i);
				
			}
		
		
			else {
				
				int value = m.get(arr[i]);
				value = value +1;
				m.put(arr[i], value);
			}
		
	}
		
		System.out.println("The map is " + m);
		System.out.println(pos);
		
		//Now write a logic that will sort the elements of the map in decreasing order of frequency.
		Set<Entry<Integer, Integer>> entry_set = m.entrySet();
		List<Entry<Integer, Integer>> al = new ArrayList<Entry<Integer, Integer>>(entry_set);
		
		Collections.sort(al,new SortByFrequency());
		System.out.println("The sorted map is " + m);
		
		 HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
	        for (Entry<Integer, Integer> aa : al) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        System.out.println(temp);
	    } 
		
	

	@Override
	public int compare(Object a, Object b) {
		
		if(((Entry<Integer, Integer>) a).getValue() > ((Entry<Integer, Integer>) b).getValue()){
			
			return 1;
		}
		
		else return -1;
		
		
		
		
	}


	  

	
}
