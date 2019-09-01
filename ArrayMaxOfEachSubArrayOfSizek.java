import java.util.Deque;
import java.util.LinkedList;

/*Given an array of integers, find the max element in each sub array of size k.
 * 
 * Solution - Use dequeue. Maintain a dequeue of size k.  The greatest element of the window will be the front
 * and the lowest will be the rear.
 * 
 * New element will always be added to the rear. The greatest and the OLDEST will always be at the front.
 * 
 * Why the oldest will be at the front ? because new elements will be added at the rear, and before adding the new
 * element we are going to remove any element smaller than it.
 * 
 * 
 */
public class ArrayMaxOfEachSubArrayOfSizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		maxElement(arr,3);
	}
	
	
	public static void maxElement(int[] arr,int k){
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		//constructing the first deque
		
		for(int i=0;i<k;i++){
			
			while(!dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
				
				dq.removeLast();
			}
			
			dq.addLast(i);
		}
		
		//Now start from i=k to n-1
		System.out.println("The max elements are ");
		for(int i=k;i< arr.length;i++){
			
			//print the max from the first queue
			System.out.print(arr[dq.peekFirst()] + " ");
			//remove the element which is no longer valid.Remember the oldest and the greatest will be at front.
			if(i-dq.peekFirst()==k){
				
				dq.removeFirst();
			}
			
			while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
				
				dq.removeLast();
			}
			
			dq.addLast(i);
		}
		
		//The last window element won't get printed in the above code so print it now
		System.out.print(arr[dq.peekFirst()]);
	}
	
	
	

}
