import java.util.HashMap;

/*Given a string , re-arrange the characters so that no adjacent characters are duplicate.
 * Solution - create a hashmap and 
 * 
 * 
 */

class Element {
	
	char ch;
	int frequency;
}
public class HeapReArrangeCharacters {

	HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	Element [] heap_arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	HeapReArrangeCharacters(String str){
		
		heap_arr = new Element[str.length()+1];
		heap_arr[0] = null;
	}
	public void createHashMap(String str){
		
		for(int i=0;i< str.length();i++){
			
			if(!m.containsKey(str.charAt(i))){
				
				m.put(str.charAt(i),1);
			}
			
			else {
				
				int value = m.get(str.charAt(i));
				value++;
				m.put(str.charAt(i), value);
			}
		}
		
		
	}
	
	public void insert(){
		
		
	}
}
