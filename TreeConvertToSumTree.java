/*GGiven a Binary Tree where each node has positive and negative values. 
 * Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. 
 * The values of leaf nodes are changed to 0.
 * 
 * Solution - For each node make n.data = left+right and return old_value + left+right
 * 
 */
public class TreeConvertToSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		convertToSumTree(n);
		printInOrder(n);
		

	}

	
	public static int convertToSumTree(Node n){
		
		if(n==null){
			
			return 0;
		}
		
		int left = convertToSumTree(n.left);
		int right = convertToSumTree(n.right);
		
		int old_value = n.data + left+right;
		n.data = left+right;
		
		return old_value;
	}
	
	public static void printInOrder(Node n){
		
		
		if(n==null){
			
			return;
		}
		
		printInOrder(n.left);
		System.out.print(n.data + " ");
		printInOrder(n.right);
	}
}
