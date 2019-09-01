import java.util.HashMap;

/*Given two strings string1 and string2, 
 * the task is to find the smallest substring in string1 containing all characters of string2 efficiently. 
 * Input: string = “this is a test string”, pattern = “tist”
Output: Minimum window is “t stri”
Explanation: “t stri” contains all the characters of pattern.

Input: string = “geeksforgeeks”, pattern = “ork”
Output: Minimum window is “ksfor”

Solution - Take the characters of pattern string and store it in a hashmap with key as the character and value
as the frequency.

b) Now traverse the original string with start index and keep traversing till you find all the characters of 2nd string.

then try to remove the characters from the front.
 * 
 */
public class StringSmallestWindowConatainingAllCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestWindow("this is a test string","tist");

	}
	
	
	public static void smallestWindow(String str1, String str2){
		
		//putting all characters of 2nd string in hashmap.
		HashMap<Character,Integer> m_str = new HashMap<Character,Integer>();
		HashMap<Character,Integer> m_pat = new HashMap<Character,Integer>();
		char[] ch = str2.toCharArray();
		
		for(int i=0;i< ch.length;i++){
			
			if(m_pat.containsKey(ch[i])){
				int value = m_pat.get(ch[i]);
				value=value+1;
				m_pat.put(ch[i],value);
			}
			else {
			m_pat.put(ch[i],1);
			}
		}
		
		//Now traversing the 1st string and finding characters.
		int count=0;
		ch = str1.toCharArray();
		int start_index =0;
		int start = 0;
		int end_index = 0;
		int window_length = Integer.MAX_VALUE;
		
		for(int i=0;i<ch.length;i++){
			
			if(m_pat.containsKey(ch[i])){
				
				//put the character in m_str
				if(m_str.containsKey(ch[i])){
					if(m_pat.get(ch[i]) > m_str.get(ch[i])){
						count++;
					}
					int value = m_str.get(ch[i]);
					value = value+1;
					m_str.put(ch[i],value);
				}
				
				else {
					count++;
					m_str.put(ch[i],1);
				}
			}
			
			if(count==str2.length()){
				
				//check whether we can move the start_index ahead.
				
				while(true){
					//System.out.println(m_str);
					//start_index++;
					//System.out.println("start index is " +start_index);
					if(m_str.containsKey(ch[start_index])){
						int value = m_str.get(ch[start_index]);
						value = value-1;
						if(value >= m_pat.get(ch[start_index])){
							
							
							m_str.put(ch[start_index],value);
							start_index++;
						}
						
						else {
							
							//can't move the start index forward. break.
							if(window_length > (i-start_index+1)){
								window_length = i-start_index+1;
								start = start_index;
								end_index =i;
							}
							//System.out.println("Hello");
							break;
						}
					}
					
					else {
						start_index++;
					}
					
					
				}
			}
		}
		
	   //printing the min window length.
		if(window_length==Integer.MAX_VALUE){
			
			System.out.println("No window found");
		}
		
		else {
			
			System.out.println("Min Window length " + window_length);
			System.out.println("Start index is " + start);
			System.out.println("End index is " + end_index);
			System.out.println("The substring is " + str1.substring(start,end_index+1));
		}
	}

}
