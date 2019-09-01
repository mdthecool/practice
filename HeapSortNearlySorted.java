/* Given an array of integers, where each element is atmost k distance away from its correct position. Sort the array
 * 
 * Solution - Use min heap to store k+1 elements and apply heapify. Put the smallest in the new array and repeat for
 * next elements of the array.
 * 
 * Why k+1 elements ? Because the element at pos 0 can be at 3 with k=2.
 * 
 * 
 * 
 */
public class HeapSortNearlySorted {

	int max_size;
	int curr_size;
	int[] heap_arr;
	int [] new_arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {6,5,3,2,8,10,9};
		int k =3;
		
		HeapSortNearlySorted ob = new HeapSortNearlySorted(k);
		ob.insert(arr);
		ob.printSortedArray();
	}

	HeapSortNearlySorted(int n){
		this.max_size =n;
		heap_arr = new int[max_size+2];
		
	}
	
	
	public int getParent(int pos){
		
		return (pos/2);
	}
	
	public int getLeftChild(int pos){
		
		return (pos*2);
	}
	
	
	public int getRightChild(int pos){
		
		return (pos*2) +1;
	}
	
	public void printSortedArray(){
		
		System.out.println("The sorted array is ");
		for(int i=0;i< new_arr.length;i++){
			
			System.out.print(new_arr[i] + " ");
		}
		
	}
		
	public void insert(int[] arr){
		
		    new_arr = new int[arr.length];
			int i=0;int k=-1;
			curr_size=0;
			//insert the first k and call swim at each call. For the rest call sink
			while(curr_size < max_size+1){
				
				curr_size = curr_size+1;
				
				heap_arr[curr_size] = arr[i];
				swim(curr_size);
				i++;
				
			}
			
			//take the first out.
			k=k+1;
			//printHeapArray(heap_arr);
			new_arr[k] = heap_arr[1];
			//now replace the root with the element and call sink for each.
			
			while(i<arr.length){
				
				heap_arr[1] = arr[i];
				sink(1);
				//printHeapArray(heap_arr);
				k=k+1;
				new_arr[k] = heap_arr[1];
				i=i+1;
			}
			
			//very important step. Now that arr is completly traversed, we need to print the rest of the elements
			//present in the heap. Delete the root/perform sink and take out the root then.
			while(max_size>0){
				
				delete();
				k=k+1;
				new_arr[k] = heap_arr[1];
				i++;
			}
	}
	
	public void swim(int pos){
		
		while(pos >0 && heap_arr[pos] < heap_arr[pos/2]){
			
			int temp = heap_arr[pos];
			heap_arr[pos] =  heap_arr[pos/2];
			heap_arr[pos/2] = temp;
			pos = pos/2;
		}
	}
	
	
	public  void sink(int pos){
	
		//System.out.println("Pos is " + pos);
		int min;
		int min_index;
		
		if((pos*2) > max_size+1){
			
			return;
		}
		
        if((pos*2) == max_size+1){
			
			min = heap_arr[pos*2];
			min_index = pos*2;
		} else {
			min = Math.min(heap_arr[pos*2],heap_arr[(pos*2)+1]);
			
			if(heap_arr[pos*2] < heap_arr[(pos*2)+1]){
				
				min_index = pos*2;
			}
			
			else {
				
				min_index = (2*pos)+1;
			}
        }
        
		if(heap_arr[pos] > min){
			
			int temp = heap_arr[pos];
			heap_arr[pos] = heap_arr[min_index];
			heap_arr[min_index] = temp;
			sink(min_index);
			
		}
	}
	
	public void delete(){
		
		//delete the root and perform sink.
		int temp = heap_arr[1];
		heap_arr[1]=heap_arr[max_size+1];
		heap_arr[max_size+1] = temp;
		max_size = max_size-1;
		sink(1);
	}
	
	public void printHeapArray(int[] heap_arr){
		
		System.out.println("The heap array is ");
		for(int i=1;i<=max_size+1;i++){
			
			System.out.print(heap_arr[i] + " ");
		}
		
		System.out.println("");
	}
}
