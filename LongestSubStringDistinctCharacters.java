import java.nio.file.SecureDirectoryStream;
import java.util.HashSet;

/*Problem - Given a string, find the longest substring of distinct characters.
 * Solution - Take two variales i and j, both pointing to 0 and a hashset.
 * Now, if the character that j is pointing to is not present in the hashset, add it and increment j.Update max_length if maxlength < j-i
 * else remove the character at i from hashset and increment i.
 * 
 * 
 */
public class LongestSubStringDistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdadcd";
		longestSubStringCharacters(str);

	}
	
	
	public static void longestSubStringCharacters(String str){
		
		
		int i=0;
		int j=0;
		int max_length=0;
		HashSet<Character> s = new HashSet();
		
		while(j<str.length()){
			
			if(!s.contains(str.charAt(j))){
				
				s.add(str.charAt(j));
				j++;
				if(max_length < (j-i)){
					max_length = j-i;
				}
			}
			
			else {
				
				s.remove(str.charAt(i));
				i++;
			}
		}
		
		System.out.println("Max length of sub string with distinct characters is " + max_length);
		
	}

}
