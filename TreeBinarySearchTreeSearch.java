
public class TreeBinarySearchTreeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(30);
		n.left.left = new Node(-10);
		n.left.right =  new Node(0);
		n.left.right.right =  new Node(5);
		n.right.right = new Node (36);
		
		search(n,36);
		
		
		
		
	}

	
	public static void search(Node n, int key){
		
		if(n == null){
			
			System.out.println("Key not found !!!!");
			return;
		}
		if(key == n.data){
			
			System.out.println("Key found");
			return;
		}
		
		else {
			
			if(key > n.data){
				
				search(n.right,key);
			}
			
			if(key < n.data){
				
				search(n.left,key);
			}
		}
		
		//System.out.print("Key not found !!!");
	}
}
