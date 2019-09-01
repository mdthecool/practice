import java.util.Stack;
/*push(s,  x)
  1) Enqueue x to q1 (assuming size of q1 is unlimited).

pop(s)  
  1) One by one dequeue everything except the last element from q1 and enqueue to q2.
  2) Dequeue the last item of q1, the dequeued item is result, store it.
 .
 * 
 * 
 * 
 */
public class ImplementQueueUsingStack {

	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementQueueUsingStack q = new ImplementQueueUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		

	}
	
	
	
	public static void enqueue(int a){
		
		s1.push(a);
		
	}
	
	public static void dequeue(){
		
		if(s1.isEmpty() && s2.isEmpty()){
			System.out.println("Stack is empty ...cannot remove");
			
		}
		if(s2.isEmpty()){
		while(s1.size()!=0){
			
			s2.push(s1.pop());
			
		}
		}
		
		System.out.println("The removed item is " + s2.pop());
		
		
		
		
	}

}
