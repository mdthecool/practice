import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SmallestElementInQueue {

	
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Deque<Integer> q2 = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallestElementInQueue a = new SmallestElementInQueue();
		a.pushElement(5);
		a.pushElement(6);
		a.pushElement(7);
		a.getMinElement();
		a.pushElement(2);
		a.getMinElement();
		
	}

	
	public static void pushElement(int num){
		
		q1.add(num);
		
		while(!q2.isEmpty() && q2.peekLast() > num){
			
			q2.removeLast();
		}
		q2.addLast(num);
		
	}
	
	public static void popElement(){
		if(q1.peek() == q2.peek()){
			q1.remove();
			q2.pop();
		}
		else {
			
			q1.remove();
		}
		
	}
	
	public static void getMinElement(){
		
		System.out.println("The minimum element in queue is " + q2.getFirst());
	}
}
