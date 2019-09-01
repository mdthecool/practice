/*Given a tree, check if it's a binary search tree. A binary search tree is a tree for which each node to left is less
 * and each node to its right is greater.
 * Solution - Pass the min and max value recursively to each node
 * 
 * 
 * 
 * 
 */
public class TreeIsBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);

		boolean b = isBinarySearchTree(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(b);
	}

	
	
	public static boolean isBinarySearchTree(Node n, int min, int max){
		
		if(n==null){
			
			return true;
		}
		if(n.data <= min || n.data >= max ){
			return false;
		}
		boolean b_left = isBinarySearchTree(n.left,min,n.data);
		boolean b_right = isBinarySearchTree(n.right,n.data,max);
		return (b_left && b_right);
	}
}
