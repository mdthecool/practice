import java.util.ArrayList;

/*Given a tree , serialize it ...ie store it in an array and de serialize it.
 * De serialize a tree ie from the array form the tree.
 * 
 * Solution - To serialize a tree, do a pre order traversal and store it in an array. Put -1 for null values.
 * 
 * 
 * 
 */
public class TreeSerializeDeSerialize {

	static ArrayList<Integer> al = new ArrayList<Integer>();
	static int index;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(7);
		n.left = new Node(2);
		n.left.left = new Node(1);
		n.right = new Node(5);
		n.right.left = new Node(3);
		n.right.right = new Node(8);
		serialize(n);
		print();

	}
	
	
	public static void serialize(Node n){
		
		//base condition
		if(n==null){
			
			al.add(-1);
			return;
		}
		
		al.add(n.data);
		serialize(n.left);
		serialize(n.right);
		
	}
	
	
	public static Node deSerialize(){
		//base condition 
		if(al.get(index)== -1){
			
			return null;
		}
		
		Node n1 = new Node(al.get(index));
		index = index+1;
		n1.left = deSerialize();
		n1.right = deSerialize();
		return n1;
		
		
	}
	
	public static void print(){
		
		for(int i=0;i<al.size();i++){
		System.out.print(al.get(i) + " ");
		}
	}

}
