import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StringSecondMostRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Geeks for Geeks is good for Geeks";
		secondHighest(str);
	}
	
	
	public static void secondHighest(String str){
		
		TreeMap<String,Integer> m = new TreeMap<String,Integer>();
		
		String[] s = str.split(" ");
		
		for(int i=0;i<s.length;i++){
			
			
			if(!m.containsKey(s[i])){
				
				m.put(s[i], 1);
			}
		
		
			else {
				
				int value = m.get(s[i]);
				value = value+1;
				m.put(s[i],value);
			}
		}
		
		//Now traverse the tree and find the highest and the second highest.
		
		Iterator<Entry<String, Integer>> itr = m.entrySet().iterator();
		int count=0;
		while(itr.hasNext()){
			count++;
			if(count==2){
				System.out.println("The second highes string is -" + itr.next().getKey());
				break;
			}
			else {
			itr.next();
			}
		}
	}

}
