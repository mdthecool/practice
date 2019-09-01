import java.util.LinkedList;
import java.util.Queue;

/*Given a tree, traverse the tree horizontally, and print the max horizontal sum
 * 
 * 
 * 
 */
public class TreeMaxHorizontalSum {

	static Queue<Node> q = new LinkedList<Node>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(23);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		maxHorizontalSum(n);

	}

	
	
	public static void maxHorizontalSum(Node n){
		
		if(n==null){
			
			System.out.println("Tree doesn't exist");
			return ;
		}
		int sum =0;
		int max_sum =0;
		q.add(n);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			if(temp == null){
				
				if(!q.isEmpty()){
					q.add(null);
				}
					if(max_sum < sum){
						
						max_sum = sum;
					}
					
					sum =0;
				}
			
			else {
				
				sum = sum + temp.data;
				if(temp.left!=null){
					q.add(temp.left);
				}
				
				if(temp.right !=null){
					
					q.add(temp.right);
				}
			}
			}
		
		System.out.println("The max sum is " + max_sum);
		
	
	}
	
}
