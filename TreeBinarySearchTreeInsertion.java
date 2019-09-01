/*Given a key and a BST, insert that key into the BST at appropriate position.
 * 
 * 
 * 
 */
public class TreeBinarySearchTreeInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		insert(n,17);
		inOrderTraversal(n);

	}
	
	
	public static void insert(Node n, int key){
		
		
		if(key > n.data){
				
			if(n.right == null){
				n.right = new Node(key);
			}
			
			else{
				insert(n.right,key);
			}
			}
			
			else if (key < n.data){
				
				if(n.left == null){
					n.left = new Node(key);
				}
				else {
				insert(n.left,key);
				}
			}
		}
	
	
	public static void inOrderTraversal(Node n){
		
		if(n==null){
			
			return;
		}
		
		else {
			
			inOrderTraversal(n.left);
			System.out.print(n.data + " ");
			inOrderTraversal(n.right);
		}
		}
		
	}


