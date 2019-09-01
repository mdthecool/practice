import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Given a string s which contains lower alphabetic characters, 
 * the task is to check if its possible to  remove at most one 
 * character from this string in such a way that frequency of each distinct character 
 * becomes same in the string.
 * 
 * Solution = Put the character in the hashmap. Key as the character and no of times as the value.
 * Traverse the hashmap and check whether the difference of each key is < 1. If not return 0
 * 
 */
public class HashingFrequenciesEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "xxxxyyzz" ;
		isFrequencyEqual(str);

	}

	
	public static void isFrequencyEqual(String str){
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		
		for(int i=0;i< ch.length;i++){
			
			if(m.containsKey(ch[i])){
				
				int value = m.get(ch[i]);
				value = value+1;
				m.put(ch[i], value);
					
	       }
			
			else {
				
				m.put(ch[i],1);
			}
		}
		
		System.out.println(m);
		
		//Now traverse the HashMap
		
		int val = -1;
		Set<Entry<Character, Integer>> e = m.entrySet();
		Iterator<Entry<Character, Integer>> itr = e.iterator();
		
		while(itr.hasNext()){
			
			if(val<0){
				val = itr.next().getValue();
			}
			
			else if(Math.abs(val-itr.next().getValue()) > 1){
				System.out.print("Not possible");
				return;
			}
		}
		
		System.out.println("Possible");
	}
}
