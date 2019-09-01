import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Given a string, rearrange the characters such that similar characters are at a distance k from each other.
 * If not possible - output -> Not Possible
 * 
 * 
 */
public class ReArrangeStringCharsSameCharsDistancek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aab";
		rearrange(str,2);

	}
	
	public static void rearrange(String str,int d){
		
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i <ch.length;i++){
			
			if(!m.containsKey(ch[i])){
				m.put(ch[i], 1);
			}
			
			else {
				
				int value = m.get(ch[i]);
				value= value+1;
				m.put(ch[i],value);
			}
		}
		
		System.out.println(m);
		for(int i=0;i< ch.length;i++){
			
			ch[i] = ' ';
		}
		
		//now traverse the hashmap
		
		Set<Entry<Character, Integer>> e_set = m.entrySet();
		ArrayList<Character> al = new ArrayList<Character>();
		
		Iterator itr = e_set.iterator();
		int i=0;
		while(itr.hasNext()){
			
			Entry<Character, Integer> e = (Entry<Character, Integer>) itr.next();
			if(e.getValue()>1){
				int k=0;
				while(k < e.getValue()){
				if(i+(k*d) < ch.length){
				ch[i+(k*d)] = e.getKey();	
					k++;
				}
				
				else {
					
					System.out.println("String cannot be converted");
					return;
				}
				}
				if(k>0){
					i++;
					k=0;
					al.add(e.getKey());
				}
			}
		
		}
		
		for(i=0;i< al.size();i++){
			
			m.remove(al.get(i));
		}
		//Now traverse the map and set the value in the remaining map.
		e_set = m.entrySet();
		itr = e_set.iterator();
		i=0;
		while(itr.hasNext()){
			
			Entry<Character, Integer> e = (Entry<Character, Integer>) itr.next();
			
			while(ch[i] !=' '){
				i++;
			}
			
			ch[i] = e.getKey();
		}
		
		System.out.println("The modified string is " + String.valueOf(ch));
	}
	
	
	
	

}
