import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

	/*enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
	 * 
	 * 
	 * 
	 * 
	 */
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementStackUsingQueue s = new ImplementStackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.pop();
		s.push(5);
		s.pop();

	}

	
	public static void push(int a){
		
		
		q1.add(a);
		
		
	}
	
	
	public static int pop(){
		
		if(q1.isEmpty()){
			System.out.println("Queue is empty....cannot remove");
			return Integer.MIN_VALUE;
		}
		while(q1.size() !=1){
			
		 q2.add(q1.remove());
		}
		
		int temp = q1.remove();
		System.out.println("Element removed is " + temp);
		
		Queue<Integer> q3 = q1;
		q1 = q2;
		q2 = q3;
		return temp;
		
		
	}
	
	
	
}
