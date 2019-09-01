
public class LinkedListQueueImplementation {

	static LinkedListNode front;
	static LinkedListNode rear;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		push(new LinkedListNode(1));
	    push(new LinkedListNode(2));
	    push(new LinkedListNode(3));
		push(new LinkedListNode(4));
		push(new LinkedListNode(5));
		pop();
		pop();
		push(new LinkedListNode(6));
		traverse();
		pop();
		traverse();
		
		
	}
	
	
	public static void push(LinkedListNode n){
		
		if(rear == null){
			front =n;
			rear = n;
		}
		else {
		rear.next = n;
		rear = rear.next;
		}
		
	}
	
	
	public static void pop(){
		
		if(front == null){
			
			System.out.println("No element to be poped");
			return;
		}
		LinkedListNode temp = front;
		front = front.next;
		temp.next = null;
		
	}
	
	
	public static void traverse(){
		LinkedListNode temp = front;
		
		while(temp!=null){
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

}
