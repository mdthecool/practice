
public class HeapKthLargestElement {

	int curr_size;
	int max_size;
	int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapKthLargestElement m = new HeapKthLargestElement(4);
		m.insert(5); 
		m.insert(3);
        m.insert(17);
        m.insert(10);
        m.insert(84);
        m.insert(19);
        m.insert(6);
        m.insert(22);
        m.insert(9); 
        m.print();
        //m.getKthLargest();

	}

	
        public void print(){
		
		System.out.println("The heap is ");
		
		
		for(int i=1;i<=curr_size;i++){
			
			System.out.print(arr[i] + " ");
			
		}
		
	}


	HeapKthLargestElement(int k){
		this.max_size = k;
		arr = new int[max_size+1];
		arr[0] = Integer.MIN_VALUE;
		
	}
	
	public int getParent(int pos){
		
		return (pos/2);
	}
	
	public int getLeftChild(int pos){
		
		return (pos*2);
	}
	
	public int getRightChild(int pos){
		
		return (pos*2)+1;
	}
	
	public void insert(int k){
		
		
		
		if(curr_size+1 > max_size){
			//we need to check if it's greater than the root.
			//System.out.println("Hi");
			if(arr[1]< k){
				
				arr[1] = k;
				sink(1);
			}
		}
			else {
				
				curr_size = curr_size+1;
				arr[curr_size] = k;
				swim(curr_size);
			}
		
		
	}
	
	public void getKthLargest(){
		
		System.out.println("The kth largest element is " + arr[1]);
	}
	
	public  void sink(int pos){
		int min;
		int min_index;
		
		if((pos*2) > max_size){
			
			return;
		}
		
        if((pos*2) == max_size){
			
			min = arr[pos*2];
			min_index = pos*2;
		}
		
        else {
		min = Math.min(arr[pos*2],arr[(pos*2)+1]);
		
		if(arr[pos*2] < arr[(pos*2)+1]){
			
			min_index = pos*2;
		}
		
		else {
			
			min_index = (2*pos)+1;
		}
        }
		if(arr[pos] > min){
			
			int temp = arr[pos];
			arr[pos] = arr[min_index];
			arr[min_index] = temp;
			sink(min_index);
			
		}
		
		else {
			
			return;
		}
		
	}
	
	public  void swim(int pos){
		
		if(pos/2<1 || arr[pos] > arr[pos/2]){
			
			return;
		}
		if(arr[pos] < arr[pos/2]){
			
			int temp = arr[pos];
			arr[pos] = arr[pos/2];
			arr[pos/2] = temp;
			swim(pos/2);
		}
		
		
	}
}


