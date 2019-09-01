import java.util.HashMap;

/*Given a string str and another string patt. 
 * Find the character in patt that is present at the minimum index in str. 
 * If no character of patt is present in str then print ‘No character present’.
 * 
 * 
 */
public class HashingMinIndexedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		minIndexedCharacter("adcffaet","onkl");
	}

	
	public static void minIndexedCharacter(String str1, String str2){
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		char[] ch = str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			
			if(m.get(ch[i]) ==null){
				m.put(ch[i],i);
			}
		}
		
		ch = str2.toCharArray();
		int index = Integer.MAX_VALUE;
		char c = 0;
		for(int i=0;i< ch.length;i++){
			
			
			
			if(m.get(ch[i])!=null){
				
				if(m.get(ch[i]) < index){
					index = m.get(ch[i]);
					c = ch[i];
				}
			}
		}
		
		if(index == Integer.MAX_VALUE){
			System.out.println("No character found");
		}
		else {
		System.out.println("The character is " + c);
		System.out.println("The index is " + index);
		}
	}
}
