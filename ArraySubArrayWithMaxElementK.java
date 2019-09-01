/*Given an array and the number k, return a sub array whose max element is k.
 * 
 * Solution - sliding window with start and end index. 
 * *** (Point to Note) If you encounter any element greater than k , then either make start =j+1 or set end = j-1
 * depending on whether you have encountered k or not.
 * 
 * 
 * 
 */
public class ArraySubArrayWithMaxElementK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={4,2,8,2,4};
		subArrays(arr,4);
	}

	
	public static void subArrays(int[] arr,int k){
		
		int max;
		int start=0;
		int end = arr.length-1;
		boolean found = false;
		int i=0;
		
		for(int j=0;j< arr.length;j++){
			
			//find the position of k and keep a count of max till that point.
			
			if(arr[j]==k){
				i=j;
				found = true;
				
			}
			
			if(arr[j]>k){
				if(found==false){
					start = j+1;
				}
				
				else {
					
					end=j-1;
					printSubArrays(arr,start,end,i);
					start = j+1;
					end=arr.length-1;
					found =false;
				}
			}
			
			
		}
		
		if(found==true){
			//we have found the start and end ...print all the subarrays with it.
			printSubArrays(arr,start,end,i);
			
			
		}
	}
	
	public static void printSubArrays(int arr[],int start_index, int end_index,int i){
		
		System.out.println("Start index is " + start_index);
		System.out.println("End index is " + end_index);
		System.out.println("");
		for(int k=start_index;k<=end_index;k++){
			System.out.print(arr[k] + " ");
		}
		//sub array of first part
		System.out.println("");
		for(int k=start_index+1;k<=i;k++){
			
			System.out.println("");
			for(int m=k;m<=end_index;m++){
				
				System.out.print(arr[m] + " ");
			}
			
		}
		
			
	    //sub array of second part
		System.out.println("");
		for(int k=end_index;k>=i;k--){
			System.out.println("");
			for(int m=start_index;m<=k;m++){
				
				System.out.print(arr[m] + " ");
			}
		}
	}
}
