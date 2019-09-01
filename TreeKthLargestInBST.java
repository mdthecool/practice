
public class TreeKthLargestInBST {

	static int count =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Node n = new Node(50);
	n.left = new Node(20);
	n.left.right = new Node(30);
	n.left.left = new Node(15);
	n.right = new Node(70);
	n.right.left = new Node(60);
	n.right.right = new Node(80);
   kthLargest(n,3);
    //kLargest(n,1);

	}

	
	
	public static void kthLargest(Node n, int k){
		
		if(n==null){
			return;
		}
		
		kthLargest(n.right,k);
		
		if(k== count){
			System.out.println("The element is " + n.data);
			count =-1;
			return;
		    
		}
		count=count+1;
		kthLargest(n.left,k);
	}
	
	
	public static void kLargest(Node n, int k){
		
		if(n==null){
			return;
		}
		
		kLargest(n.right, k);
		if(k==1){
			
			System.out.println(n.data);
			
			return;
		}
		
		kLargest(n.left,k-1);
	}
}
