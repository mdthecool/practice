/*Given a binary tree , print the size of the largest binary tree in it.
 * 
 * Solution - Do a post order traversal. Every node should return 4 things, is it a BST, size, min_value,max_value
 * These 4 things can be kept as an field of a class. And we can return the object of the class.
 * 
 * 
 * 
 */
public class TreeLargestBSTInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(25);
		n.right = new Node(50);
		n.right.right = new Node(60);
		n.right.right.right = new Node(70);
		n.right.right.left = new Node(55);
		n.right.left = new Node(35);
		n.right.left.right = new Node(40);
		n.right.left.left = new Node(20);
		n.right.left.left.right = new Node(35);
		n.left = new Node(18);
		n.left.right = new Node(20);
		n.left.right.right = new Node(25);
		n.left.right.left = new Node(18);
		n.left.left = new Node(19);
		n.left.left.right = new Node(15);
		
		SearchTree t = size(n);
		System.out.println("The max size of binary search tree is " + t.size);

	}
	
	
	public static SearchTree size(Node n){
		
		
		//base condition 
		if(n==null){
			
			return new SearchTree();
		}
		
		SearchTree left = size(n.left);
		SearchTree right = size(n.right);
		
		if(left.isBST == false || right.isBST == false || n.data < left.max_value || n.data > right.min_value){
			
			return new SearchTree(false,Math.max(left.size,right.size),Integer.MIN_VALUE,Integer.MAX_VALUE);
			
		}
		
		//will come to this position if both children return true and this ode itself is a part of BST
		int size = left.size + right.size +1;
		
		boolean b = true;
		int min_value;
		int max_value;
		if(n.left == null){
			
			min_value = n.data;
		}
		
		else {
			min_value = left.max_value;
		}
		
		if(n.right == null){
			
			max_value = n.data;
		}
		else {
			
			max_value = right.min_value;
		}
		
		return new SearchTree(b,size,min_value,max_value);
	}

}

class SearchTree{
	
	boolean isBST;
	int size;
	int min_value;
	int max_value;
	
	SearchTree(){
		
		isBST = true;
		size=0;
		min_value = Integer.MAX_VALUE;
		max_value = Integer.MIN_VALUE;
	}
	
	SearchTree(boolean b, int size, int min_value, int max_value){
		
		this.isBST = b;
		this.size = size;
		this.min_value = min_value;
		this.max_value = max_value;
	}
}