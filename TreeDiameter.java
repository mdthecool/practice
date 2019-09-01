/*Given a tree, print the diameter of the tree. DIameter of a tree is defined as the longest distance 
 * between two leaf nodes.
 * 
 * Solution - Diameter of tree is Max of left diameter, right diameter and 1 + left_height + right_height
 * 
 * 
 * 
 * 
 * 
 */
public class TreeDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		int d = diameter(n);
		System.out.println("The diameter of the tree is " + d);

	}
	
	
	
	public static int diameter(Node n){
		
		if(n== null){
			
			return 0;
		}
		int left_height = height(n.left);
		int right_height = height(n.right);
		int left_d = diameter(n.left);
		int right_d = diameter(n.right);
		int max = Math.max(left_d,right_d);
		return Math.max(max,1+ (left_height+right_height));
		
		
	}

	
	public static int height(Node n){
		
		//base condition
		if(n== null){
			
			return 0;
		}
		
		else {
			
			int left_height = height(n.left);
			int right_height = height(n.right);
			return 1 + Math.max(left_height,right_height);
		}
		
	}
}
