import java.util.ArrayList;

/* Given a tree and a sum, find if there is a path in the tree that is equal to the sum. Also return the path.
 * 
 * Solution - Call the left and the right nodes recursivly and add the node data to the arraylist if the 
 * result is true.
 * 
 * 
 */
public class TreeRootLeafSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean b = rootLeafSum(n,44,al);
		System.out.print(b);

	}

	
	
	public static boolean rootLeafSum(Node n, int key, ArrayList<Integer> al){
		
		//Writing base conditions
		//if it's null
		if(n == null){
			return false;
			
		}
		
		//if it's a leaf node
		if(n.left == null && n.right == null){
			
			if(n.data == key){
				
				return true;
			}
			
			else {
				return false;
			}
		}
		
		if(rootLeafSum(n.left,key-n.data,al)){
			
			return true;
		}
		
		if(rootLeafSum(n.right,key-n.data,al)){
			
			return true;
		}
		
		return false;
	}
}
