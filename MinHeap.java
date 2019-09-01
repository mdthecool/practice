
public class MinHeap {

	int max_size;
	int [] arr;
	int curr_size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinHeap m = new MinHeap(10);
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

	}

	MinHeap(int max_size){
		this.max_size=max_size;
		arr = new int[max_size+1];
		
	}
	
	public int getParent(int pos){
		return pos/2;
		
		
	}
	
	public int getLeftChild(int pos){
		
		return (2*pos);
	}
	
	public int getRightChild(int pos){
		
		return (2*pos)+1;
	}
	
	public void insert(int k){
		if(curr_size+1 > max_size){
			
			System.out.println("Heap is full ...please delete some elements");
			return;
		}
		curr_size =curr_size+1;
		arr[curr_size] = k;
		//Now check if it's in correct position.
		swim(curr_size);
		
	}
	
	
	public void remove(){
		
		//
		int temp = arr[curr_size];
		arr[curr_size] = arr[1];
		arr[1] = temp;
		curr_size = curr_size-1;
		sink(1);
		
	}
	
	public void print(){
		
		System.out.print("The heap is ");
		for(int i=1;i<=curr_size;i++){
			
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void swim(int pos){
		
		if(arr[pos]>arr[pos/2] || pos < 1){
			
			return;
		}
		
		else {
			
			int temp = arr[pos];
			arr[pos] = arr[pos/2];
			arr[pos/2] = temp;
			swim(pos/2);
		}
		
	}
	
	public  void sink(int pos){
		int min;
		int min_index;
		
		if((pos*2) > max_size+1){
			
			return;
		}
		
        if((pos*2) == max_size+1){
			
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
	
	public void getMin(){
		
		System.out.println("The minimum element is " + arr[1]);
		
	}
}
