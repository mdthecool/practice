import java.util.Stack;

/*Given a string, recursively remove adjacent duplicate characters from string. 
 * The output string should not have any adjacent duplicates
 * Input:  azxxzy
Output: ay
First "azxxzy" is reduced to "azzy". 
The string "azzy" contains duplicates, 
so it is further reduced to "ay".

Input: geeksforgeeg
Output: gksfor
First "geeksforgeeg" is reduced to 
"gksforgg". The string "gksforgg" 
contains duplicates, so it is further 
reduced to "gksfor".

Input: caaabbbaacdddd
Output: Empty String

Input: acaaabbbacdddd
Output: acac

Solution - Traverse the array, if stack is empty add to stack. Peek from stack. If top is same as the element
pop from stack and move ahead in the array.
 * 
 * 
 */
public class StringRemoveAdjacentDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "acaaabbbacdddd";
		removeDuplicates(str);

	}

	
	
	public static void removeDuplicates(String str){
		
		Stack<Character> s = new Stack<Character>();
		char[] ch = str.toCharArray();
		int flag =0;
		int i=0;
		
		while( i < ch.length){
			
			if(s.isEmpty() || ch[i]!=s.peek()){
				
				s.push(ch[i]);
				i++;
			}
			
			else {
				
				while(i < ch.length && s.peek()== ch[i]){
					
					i++;
				}
				s.pop();
			}
			
		}
		
		
		System.out.println("The String is " + String.valueOf(s));
		
	}
}
