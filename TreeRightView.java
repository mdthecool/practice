import java.util.LinkedList;
import java.util.Queue;

public class TreeRightView {

	static Queue<Node> q = new LinkedList<Node>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		rightView(n);
	}
	
	
	public static void rightView(Node n){
		
	if(n==null){
		
		return;
	}
	
	q.add(n);
	q.add(null);
	System.out.println("The right view is ");
	
	
	while(!q.isEmpty()){
		
		Node temp = q.remove();
		if(temp !=null && q.peek()==null){
			
			System.out.print(temp.data + " ");
		}
		
		if(temp == null){
			if(!q.isEmpty()){
			q.add(null);
			}
		}
		else {
		if(temp.left!=null){
			
			q.add(temp.left);
		}
		
		if(temp.right !=null){
			
			q.add(temp.right);
		}
		
		}
	}
	}

}
