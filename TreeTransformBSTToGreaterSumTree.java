/*Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed 
 * to the original key plus sum of all keys greater than the original key in BST.
 * 
 * 
 * Solution - do reverse Inorder Traversal
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

public class TreeTransformBSTToGreaterSumTree {

	static int sum =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(11);
		n.left = new Node(2);
		n.left.left = new Node(1);
		n.left.right = new Node(7);
		n.right = new Node(29);
		n.right.left = new Node(15);
		n.right.right = new Node(40);
		n.right.right.left = new Node(35);
		BSTGreaterTree(n);
		print(n);
	}

	
	
	
	public static void BSTGreaterTree(Node n){
		
		
		if(n==null){
			
			return ;
		}
		
		BSTGreaterTree(n.right);
		int temp = n.data;
		n.data = sum;
		sum = sum + temp;
		BSTGreaterTree(n.left);
		
		
		
	}
	
	public static void print(Node n){
		
		if(n==null){
			
			return;
		}
		
		print(n.left);
		System.out.print(n.data + " ");
		print(n.right);
	}
}
