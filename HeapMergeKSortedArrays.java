/*Given k sorted array of integers. Merge them to form a sorted array.
 * 
 * Solution - A naive solution would be to look at the 0th element of each and put the min into the new array.
 * Comparing the 0th element of each would take o(k) and doing it for each element would be o(n).
 * 
 * A better solution would be to keep a min heap of k elements. Add the k elements into the heap. Heapfiy. Take the
 * smallest into the new array. Add a new element into the new array and heapify till all the arrays are completed.
 * 
 * 
 * 
 * 
 */
public class HeapMergeKSortedArrays {

	static int[] heap_arr;
	static int max_size;
	static int curr_size;
	static int[] new_arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 HeapMergeKSortedArrays(int [][] input_arr){
		
		max_size = input_arr.length+1;
		new_arr = new int[(input_arr.length*input_arr[0].length)];
		heap_arr = new int[max_size];
		curr_size =0;
	}
	
	public static int getParent(int pos){
		
		return (pos/2);
	}

	
	public static int getLeftChild(int pos){
		
		return (2*pos);
	}
	
	public int getRightChild(int pos){
		
		return (2*pos)+1;
	}
	
	
	public static void swim(int pos){
		
		if(pos/2 >0){
		if(heap_arr[pos]< heap_arr[pos/2]){
			
			int temp = heap_arr[pos];
			heap_arr[pos] = heap_arr[pos/2];
			heap_arr[pos/2] = temp;
			swim(pos/2);
		}
		}
		
		
	}
	
	//You always sink the first element.
	public static void sink(int pos){
		
		int min;
		int min_index;
		if((2*pos) > max_size){
			
			return;
		}
		
		if((2*pos) == max_size){
			
			min = heap_arr[pos*2];
			min_index = (pos*2);
			
		}
		
		else {
			
			min = Math.min(heap_arr[pos*2],heap_arr[(pos*2)+1]);
			if(min == heap_arr[pos*2]){
				
				min_index = pos*2;
			}
			
			else {
				
				min_index = (pos*2)+1;
			}
			
		}
		
		//switch the elements.
		int temp = heap_arr[min_index];
		heap_arr[min_index]=heap_arr[pos];
		heap_arr[pos] = temp;
		sink(min_index);
	}
	
	
	public static void merge(int[][] arr){
		
		//insert the first k elements into the heap and call swim after each.
		
		int i = 0;
		while(i <arr[0].length){
			
			heap_arr[i+1] = arr[i][0];
			swim(i+1);
			i++;
		}
		
		//Now the lowest most will be the root . Take that into the new array.
		
		new_arr[0] = heap_arr[1];
		
		//Now replace the root with the next slower in the same array.
	}
	public static void printSortedArray(){
		
		
	}
	
	
}
