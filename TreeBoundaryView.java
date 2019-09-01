import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

/* Given a tree , print the boundary view of the tree.
 * 
 * Solution- boundary view of the tree is the left view + right view + leaf nodes.
 * 
 * Note** - The trick in the question is to avoid the duplication of nodes which come in more than one view.
 * 
 * 
 */

public class TreeBoundaryView {

	static LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		boundaryView(n);
		
	}
	
	
	
	public static void boundaryView(Node n){
		
		//call the left view method.
		
		rightView(n);
		leafNodes(n);
		leftView(n);
		print();
	}

	
	public static void leftView(Node n){
		Queue<Node> q = new LinkedList<Node>();
		if(n==null){
			
			return;
		}
		
		q.add(n);
		s.add(n.data);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			if(temp == null){
				
				if(!q.isEmpty()){
				s.add(q.peek().data);
				q.add(null);
				}
			}
			
			else {
				
				if(temp.left!=null){
					
					q.add(temp.left);
				}
				
				if(temp.right!=null){
					
					q.add(temp.right);
				}
			}
		}
		
	}
	
	
	public static void rightView(Node n){
		
		Queue<Node> q = new LinkedList<Node>();
		if(n==null){
			
			return;
		}
		
		q.add(n);
		q.add(null);
		
		
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			
			if(q.peek()==null && !q.isEmpty()){
				
			  s.add(temp.data);
			}
			
			if(temp == null){
				
				if(!q.isEmpty()){
					
					q.add(null);
				}
			}
			else {
			if(temp.left !=null){
				
				q.add(temp.left);
			}
			
			if(temp.right !=null){
				
				q.add(temp.right);
			}
		}
		}
	}
	
	public static void leafNodes(Node n){
		
		if(n==null){
			return;
		}
		if(n.left == null && n.right == null){
			s.add(n.data);
			return;
		}
		
		
		leafNodes(n.left);
		leafNodes(n.right);
	}
	
	
	public static void print(){
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()){
			
			System.out.print(itr.next() + " ");
		}
		
	}
}
