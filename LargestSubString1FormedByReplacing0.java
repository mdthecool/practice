//https://www.geeksforgeeks.org/longest-subsegment-1s-formed-changing-k-0s/

public class LargestSubString1FormedByReplacing0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr  = {1, 0, 0, 1, 1, 0, 1};
		longestSubString(arr,1);
	}

	
	public static void longestSubString(int[] arr,int k){
		
	    int i=0;
	    int count=0;
	    int max_length=0;int curr_length=1;
	    int start_index =-1;
	    int end_index =-1;
		while(i<arr.length){
			
			int temp = arr[i];
			int j = i+1;
			while(k>= count && j<arr.length){
				
				if(arr[j]==temp){
					
					curr_length++;
				}
				
				else {
					
					if(count==k){
						break;
					}
					count++;
					curr_length++;
				}
			
				j++;
			}
			
			if(max_length < curr_length){
				max_length = curr_length;
				start_index =i;
				end_index = j-1;
			}
			
			count=0;
			curr_length=1;
			
			i++;
			
		}
		
		System.out.println("Max substring is of length  " + max_length);
		System.out.println("Start index is " + start_index);
		System.out.println("End index is " + end_index);
	}
}
