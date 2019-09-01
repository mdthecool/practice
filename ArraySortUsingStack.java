import java.util.Stack;

public class ArraySortUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6,5,4,3,8,9};
		sort(arr);
	}
	
	
	public static void sort(int[] arr){
		
		Stack<Integer> s = new Stack<Integer>();
		int c=0;
		for(int i=0;i<arr.length;i++){
			c=0;
			for(int j=0;j<arr.length-1-i;j++){
				
				if(s.isEmpty()){
					
					s.add(arr[j]);
				}
				
				else {
					
					if(arr[j]>s.peek()){
					
						while(!s.isEmpty() && arr[j]> s.peek()){
							arr[c] = s.pop();
							c=c+1;
						}
						
						s.push(arr[j]);
					}
					
					else {
						
						s.push(arr[j]);
					}
				}
				
			}
			
			if(!s.isEmpty()){
				
				while(!s.isEmpty()){
					
					arr[c] = s.pop();
					c=c+1;
				}
			}
		}
		
		System.out.println("The sorted array is ");
		for(int i=0;i< arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
	}

}
