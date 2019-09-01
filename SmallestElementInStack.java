import java.util.Stack;

/*Print the smallest element in stack in o(1) time.
 * You can use extra space.
 * 
 * 
 */
public class SmallestElementInStack {

	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		SmallestElementInStack s = new SmallestElementInStack();
		s.push(5);
		s.push(7);
		s.push(8);
		s.push(3);
		s.smallestElementInStack();
		s.pop();
		s.smallestElementInStack();
		

	}

	
	public static void smallestElementInStack(){
		
		System.out.println("The smallest element in stack is " + s2.peek());
		
		
	}
	
	
	public static void push(int a){
		
		if(s1.isEmpty()){
			s1.push(a);
			s2.push(a);
			
		}
		
		else {
			
			s1.push(a);
			if(a<s2.peek()){
				s2.push(a);
			}
		}
	}
	
	
	public static void pop(){
		
		if(s1.pop()==s2.peek()){
			
			s2.pop();
		}
		
		else {
			s1.pop();
		}
	}
}
