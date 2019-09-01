import java.util.Stack;

public class TreePrintSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		printSpiral(n);

	}
	
	
	public static void printSpiral(Node n){
		
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		if(n==null){
			
			return;
		}
		
		s1.add(n);
		while(!s1.isEmpty() || !s2.isEmpty()){
			
			while(!s1.isEmpty()){
				
			  Node temp = s1.pop();
			  System.out.print(temp.data + " ");
			  
			  if(temp.left!=null){
				  
				  s2.add(temp.left);
				  
			  }
			  
			  if(temp.right!=null){
				  
				  s2.add(temp.right);
			  }
			}
			
			System.out.println("");
			while(!s2.isEmpty()){
				
				Node temp = s2.pop();
				System.out.print(temp.data + " ");
				
				if(temp.right !=null){
					
					s1.push(temp.right);
					
				}
				
				if(temp.left !=null){
					
					s1.push(temp.left);
				}
			}
			
			System.out.println("");
			
		}
	}

}
