import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*Design a data structure that can insert delete get and getRandom in o(1) time.
 * 
 * Solution - Take a Hashmap and an arraylist. The hashmap will contain the key and the value as the index of the array.
 * Arraylist will hold the key.
 * 
 * 
 */
public class GetInsertDeleteGetRandom {

	static HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
	static ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public static void insert(int n){
		
		if(!m.containsKey(n)){
			
			al.add(n);
			m.put(n,al.size()-1);
		}
		
	}
	
	public static void delete(int n){
		
	
		if(m.containsKey(n)){
			
			//remove from arraylist by substituting with last.
			int temp = al.get(m.get(n));
			al.set(m.get(n),al.get(al.size()-1));
			al.set(al.size()-1,temp);
			al.remove(al.size()-1);
			//could have used Collections.swap also.
		}
		
		else {
			System.out.println("Element not present");
		}
	}
	
	
	public static int get(int n){
		
		if(m.containsKey(n)){
			 return m.get(n);
		}
		else {
			
			System.out.println("Element not found");
			return -1;
		}
		
	}
	
	
	public static int getRandom(){
		
		Random r = new Random(al.size()-1);
		return al.get(r.nextInt());
		
	}
	
	public static int search(int n){
		
		return m.get(n);
	}
}
