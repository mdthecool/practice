/*Convert an arbitrary Binary Tree to a tree that holds Children Sum Property
 * Given an arbitrary binary tree, convert it to a binary tree that holds Children Sum Property. 
 * You can only increment data values in any node 
 * (You cannot change the structure of the tree and cannot decrement the value of any node)
 * 
 * https://www.geeksforgeeks.org/convert-an-arbitrary-binary-tree-to-a-tree-that-holds-children-sum-property/
 * 
 * 
 * 
 */
public class TreeConvertToChildSum {

	static int diff =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(50);
		n.left = new Node(7);
		n.right = new Node(2);
		n.left.left = new Node(3);
		n.left.right =  new Node(5);
		n.right.left =  new Node(1);
		n.right.right = new Node (30);
		convert(n);
		printInOrder(n);

	}
	
	
	public static int convert(Node n){
		
		if(n==null){
			
			return 0;
		}
		
		int left_child = convert(n.left);
		int right_child = convert(n.right);
		
		if(n.data == left_child + right_child){
			
			return n.data;
		}
		
		else {
			
			if(n.data < left_child + right_child){
			n.data = left_child + right_child;
			return n.data;
			}
			
			else {
			
				diff = n.data -(left_child+ right_child);
				increment(n.left,diff);
				return n.data;
			}
		}
		
	}

	public static void printInOrder(Node n){
		
		if(n==null){
			
			return;
		}
		
		printInOrder(n.left);
		System.out.print(n.data + " ");
		printInOrder(n.right);
	}
	
	public static void increment(Node n,int diff){
		
		if(n==null){
			
			return;
		}
		
		n.data = n.data + diff;
		increment(n.left,diff);
		
	}
}
