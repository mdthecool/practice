
public class InsertionBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	
	public static Node insertion(Node n, int key){
		
		
		Node current = n;
		Node parent = null;
		
		if(current == null){
			
			Node n1 = new Node(key);
			return n1;
		}
		while(current !=null){
			
			parent = current;
			if(key>current.data){
				current = current.right;
			}
			
			else {
				current = current.left;
			}
		}
		
		if(parent.data < key){
			
			Node n1 = new Node(key);
			parent.right = n1;
			return n1;
		}
		
		else {
			
			Node n1 = new Node(key);
			parent.left = n1;
			return n1;
		}
	}

}
