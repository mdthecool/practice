/*Given a tree, traverse the tree level by level.
 * 
 * Solution - if n == null , return
 * Push the first element of the tree in a queue. 
 * while queue is not empty
 * Pop from the queue and push its left and right to the queue if they are not null.
 * Print the poped element.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {

	static Queue<Node> q = new LinkedList<Node>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		levelOrderTraversal(n);
	}

	
	public static void levelOrderTraversal(Node n){
		
		
		if(n==null){
			
			return;
		}
		
		q.add(n);
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			System.out.print(temp.data + " ");
			if(temp.left!=null){
				
				q.add(temp.left);
			}
			
			if(temp.right!=null){
				
				q.add(temp.right);
			}
		}
	}
}
