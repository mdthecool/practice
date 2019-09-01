import java.util.LinkedList;
import java.util.Queue;

/*Given a tree, print the sum of each diagonal of the tree.
 * 
 * Solution - Problem is similar to printing the tree diagonally. 
 * 
 * 
 */
public class TreeDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.right.left = new Node(4);
		n.right.right = new Node(5);
		n.right.left.left = new Node(6);
		printDiagonalSum(n);
	}

	
	public static void printDiagonalSum(Node n){
		
		if(n==null){
			
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		q.add(null);
		int sum =0;
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			if(temp == null){
				System.out.println("The sum is " + sum);
				sum =0;
				if(!q.isEmpty()){
					
					q.add(null);
				}
			}
			
			else {
				
				
				while(temp !=null){
					
					sum = sum + temp.data;
					if(temp.left !=null){
						
						q.add(temp.left);
					}
					
					temp = temp.right;
				}
			}
		}
	}
}
