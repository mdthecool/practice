import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		firstRepeatedCharacter(str);
		repeatedCharacterComingFirstInString(str);
	}

	
	public static void firstRepeatedCharacter(String str){
		
		char[] ch = str.toCharArray();
		HashSet m = new HashSet();
		
		for(int i =0;i< ch.length;i++){
			
			if(m.contains(ch[i])){
				System.out.println("First repeated character is " + ch[i]);
				return;
			}
			
			else {
				m.add(ch[i]);
			}
		}
	}
	
	
	public static void repeatedCharacterComingFirstInString(String str){
		
		LinkedHashMap<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		ArrayList<Integer> al;
		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length;i++){
			
			if(m.containsKey(ch[i])){
				int value = m.get(ch[i]);
				value = value +1;
				m.put(ch[i],value);
			}
			
			else {
				
			    m.put(ch[i],1);
			}
		}
		
		//Now iterate through the hashmap
		 
		 Iterator<Map.Entry<Character,Integer>> itr = m.entrySet().iterator(); 
		 while(itr.hasNext()){
			 
			 Entry<Character, Integer> obj = itr.next();
			if (obj.getValue() >1){
				
				System.out.println("The first repeating character is " + obj.getKey());
				return;
			}
		 }
	}
}
