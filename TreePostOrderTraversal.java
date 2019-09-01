
public class TreePostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10);
		n.left = new Node(15);
		n.right = new Node(30);
		n.left.left = new Node(3);
		n.left.right =  new Node(6);
		n.left.left.left = new Node(5);
		n.right.right = new Node(2);
		n.right.right.left = new Node(9);
	    n.right.right.right = new Node(8);
		postOrderTraversal(n);
	}

	
	public static void postOrderTraversal(Node n){
		
		
		if(n==null){
			
			return;
		}
		
		postOrderTraversal(n.left);
		postOrderTraversal(n.right);
		System.out.print(n.data + " ");
		
	}
}
