import java.util.Stack;

/*Given a string S, remove all the consecutive duplicates. 
 * Input  : aaaaabbbbbb
Output : ab

Input : geeksforgeeks
Output : geksforgeks

Input : aabccba
Output : abcba

Solution - Traverse the array and put the element in a stack.If top of stack == element encountered don't 
put to stack
 * 
 * 
 * 
 */
public class StringRemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabccba";
		removeDuplicates(str);
	}

	
	public static void removeDuplicates(String str){
		
		Stack<Character> s = new Stack<Character>();
		char[] ch = str.toCharArray();
		for(int i=0;i< ch.length;i++){
		if(s.isEmpty() || s.peek() != ch[i]){
			s.push(ch[i]);
		}
		
		else if(s.peek()==ch[i]){
			continue;
		}
		
		
		}
		
		System.out.println("The string is " + String.valueOf(s));
	}
}
