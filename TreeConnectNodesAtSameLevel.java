import java.util.LinkedList;
import java.util.Queue;

public class TreeConnectNodesAtSameLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		connect(n);

	}

	
	
	
	public static void connect(Node n){
		
		if(n==null){
			
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			
			if(temp == null){
				
				if(!q.isEmpty()){
				q.add(null);
				}
			}
			else {
			if(q.peek() == null){
			System.out.println(temp.data + "--->" + q.peek());
			}
			else {
				System.out.println(temp.data + "--->" + q.peek().data);
			}
			temp.nextRight = q.peek();
			
			if(temp.left !=null){
				
				q.add(temp.left);
			}
			
			if(temp.right !=null){
				
				q.add(temp.right);
			}
			
			}
		}
		
	}
}
