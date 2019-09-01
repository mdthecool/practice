import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DegreeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,4,2,1,2,2,1,1,6,1,7,2};
		degreeOfArray(arr);
	}

	/*This program will return the sub array that has all the frequencies of the most frequent element.
	 * If two numbers have same degree, the program should return the sub array that has min size
	 * Algo - Take a hashmap that has key as the element and value as the number of times it appears, start index and end index
	 * Now Traverse the hashmap and get the most frequent element , it's starting and end index
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void degreeOfArray(int[] arr ){
		
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
		int freq=-1; int start=-1; int end=-1;
		int element = -1 ;
		
		for(int i=0;i< arr.length;i++){
			
			if(m.containsKey(arr[i])){
			
				
		    ArrayList<Integer> al = new ArrayList<Integer>();
			al = m.get(arr[i]);
			int count = al.get(0);
			count++;
			al.set(0,count);
			al.set(2,i);
			m.put(arr[i],al);
				
			}
			
			else {
				
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(1); //frequency
				al.add(i); //start index
				al.add(i); //end index
				m.put(arr[i],al);
				
				
				
			}
			
			
		}
		System.out.println(m);
		//Now that the hashmap is set, traverse the hashmap and get the sub array index
		 Iterator itr = m.entrySet().iterator();
		 while(itr.hasNext()){
			 
			 Map.Entry mapElement = (Map.Entry)itr.next();
			 if(((ArrayList<Integer>) mapElement.getValue()).get(0)> freq){
				 
				 freq = (int) ((ArrayList<Integer>) mapElement.getValue()).get(0);
				 start = (int) ((ArrayList<Integer>) mapElement.getValue()).get(1);
				 end = (int) ((ArrayList<Integer>) mapElement.getValue()).get(2); 
				 element = (int) mapElement.getKey();
			 }
			 
              if(((ArrayList<Integer>) mapElement.getValue()).get(0) == freq){
				 
            	 if(((int) ((ArrayList<Integer>) mapElement.getValue()).get(2) - (int) ((ArrayList<Integer>) mapElement.getValue()).get(1)) < (end-start) ){
				 freq = (int) ((ArrayList<Integer>) mapElement.getValue()).get(0);
				 start = (int) ((ArrayList<Integer>) mapElement.getValue()).get(1);
				 end = (int) ((ArrayList<Integer>) mapElement.getValue()).get(2); 
				 element = (int) mapElement.getKey();
            	 }
			 }
			
		 }
		 
		 
		 System.out.println("Most frequent element is " + element);
		 System.out.println("Starting index is " + start);
		 System.out.println("End index is " + end);
	}
}
