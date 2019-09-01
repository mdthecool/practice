import java.util.Stack;

public class NextGreaterElement {

	static Stack<Integer> s = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {11, 13, 21, 3};
		nextGreaterElement(arr);
	}
	
	
	public static void nextGreaterElement(int[] arr){
		
		for(int i =0;i <arr.length;i++){
			
			if(s.isEmpty()){
				
				s.push(arr[i]);
			}
			
			else {
				
				while(!s.isEmpty() && s.peek()<arr[i]){
					
					System.out.println("The next greater element for " + s.peek() + " is " + arr[i]);
					s.pop();
				}
				s.push(arr[i]);
			}
		}
		
		while(!s.isEmpty()){
			
			System.out.println("The next greater element for " + s.pop() + " is -1" );
		}
		
	}

}
