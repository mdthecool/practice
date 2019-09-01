import java.util.LinkedList;
import java.util.Queue;

/*Given a tree, print the nodes diagonally.
 * 
 * Solution - The solution is similar to level order traversal. Traverse the right nodes and print it. If for each
 * node, any node has a left child, store in queue.
 * 
 * 
 * 
 */
public class TreePrintNodesDiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		
		printDiagonalNodes(n);
		
	}

	
	public static void printDiagonalNodes(Node n){
		
		if(n==null){
			
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		q.add(null);
		
		while(!q.isEmpty()){
			
			
			Node temp = q.remove();
			
			if(temp == null){
				System.out.println();
				if(!q.isEmpty()){
					
					q.add(null);
				}
			}
			
			else {
				
				while(temp !=null){
					
					System.out.print(temp.data + " ");
					if(temp.left !=null){
						q.add(temp.left);
					}
					
					temp = temp.right;
				}
			}
		}
	}
}
