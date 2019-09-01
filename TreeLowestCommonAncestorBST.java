/*Given a bst, find the lowest common ancestor.
 * Solution - return the node for which n.data is between k1 and k2. if n.data > k1 and k2 go to right else left.
 * 
 * 
 * 
 * 
 */
public class TreeLowestCommonAncestorBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);

		lca(n,16,18);

	}

	
	
	public static void lca(Node n, int k1,int k2){
		
		if(n==null){
			
			return;
		}
		
		
		if((n.data <= k1 && n.data >= k2) || (n.data >= k1 && n.data <= k2)){
			System.out.println("The lowest common ancestor is " + n.data);
			return;
		}
			
			if(n.data > k1 && n.data > k2){
				
				lca(n.left,k1,k2);
			}
			
			else if(n.data < k1 && n.data < k2){
				
				lca(n.right,k1,k2);
			}
		
		
	}
	
}
