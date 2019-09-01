/*Given a binary tree, find if it is height balanced or not.  A tree is height balanced if difference between 
 * heights of left and right subtrees is not more than one for all nodes of tree. 
 * 
 * A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5
* 
* 
* 
* Solution - 
* 
* 
* 
* 
*/
public class TreeIsHeightBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		boolean b = isHeightBalanced(n);
		System.out.println(b);

	}
	
	
	public static boolean isHeightBalanced(Node n){
		
		if(n== null){
			
			return true;
		}
		
		else {
			
			int left_h = height(n.left);
			int right_h = height(n.right);
			
			if(Math.abs(left_h-right_h)<=1  && isHeightBalanced(n.left) && isHeightBalanced(n.right)){
				return true;
			}
			
			return false;
		}
	}
	
	
	public static int height(Node n){
		
		if(n==null){
			
			return 0;
		}
		
		else {
			
			
			return (1+Math.max(height(n.left),height(n.right)));
		}
	}

}
