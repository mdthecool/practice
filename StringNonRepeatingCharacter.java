import java.util.HashMap;

/*Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.
hello
zxvczbtxyzvy
xxyyzz

Output :
h
c
-1
 * 
 * 
 * 
 */
public class StringNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "xxyyzz";
		nonRepeatingChar(str);
	}

	
public static void nonRepeatingChar(String str){
	
	char[] ch = str.toCharArray();
	HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	
	for(int i=0; i< ch.length;i++){
		
		if(!m.containsKey(ch[i])){
			
			m.put(ch[i], 1);
		}
		
		else {
			
			int value = m.get(ch[i]);
			value = value +1;
			m.put(ch[i],value);
		}
		
	}
	
	for(int i=0;i< ch.length;i++){
		
		if(m.get(ch[i])==1){
			
			System.out.println("The first non repeating character is " + ch[i]);
			break;
		}
	}
	
	System.out.println("No repeating character");
}
}
