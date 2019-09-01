import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*Given a tree, print the level order of tree in reverse ie start from bottom.
 * 
 * 
 * 
 */
public class TreeReverseLevelOrder {
	
	public static void main(String[] args){
		
		Node n = new Node(1);
		n.left = new Node(2);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right = new Node(3);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		reverseLevelOrder(n);
		
	}
	
	public static void reverseLevelOrder(Node n){
		
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		
		q.add(n);
		q.add(null);
		s.add(n);
		s.add(null);
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			if(temp==null){
				if(!q.isEmpty()){
					q.add(null);
					s.add(null);
				}
			}
			
			else {
				
				
				if(temp.right !=null){
					q.add(temp.right);
					s.add(temp.right);
				}
				if(temp.left !=null){
					q.add(temp.left);
					s.add(temp.left);
					
				}
				
				
				
				
			}
		}
		
		//now print the nodes in reverse level order by poppng the nodes.
		while(!s.isEmpty()){
			Node temp = s.pop();
			if(temp==null){
				System.out.println("");
			}
			else {
				
				System.out.print(temp.data + " ");
			}
		}
	}
	
	
	

}
