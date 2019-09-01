/*Given an array of integers you need to find the longest bitonic subsequence
 * 
 * Solution = Calculate Longest increasing from front. Calculate longest increasing from back.
 * Biotonic subsequence is longest from front + longest from back -1 (because the element is taken twice into 
 * consideration.
 * 
 * 
 * 
 */
public class DPLongestBiotonicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {80, 60, 30, 40, 20, 10};
		longestBiotonicSubsequence(arr);

	}

	
	public static void longestBiotonicSubsequence(int[] arr){
		
		int[] front = new int[arr.length];	
		int[] back = new int[arr.length];
		
		//initialize the array to 1 for all the elements.
		for(int i=0;i< arr.length;i++){
			
			front[i]=1;
			back[i]=1;
			
		}
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=0;j<i;j++){
				
				if(arr[i]> arr[j]){
					
					front[i] = Math.max(front[i],front[j]+1);
				}
			}
		}
		
		
		//doing LIS from back.
		
		for(int i= arr.length-2;i>=0;i--){
			
			for(int j=arr.length-1;j>i;j--){
				
				if(arr[i] > arr[j]){
					back[i] = Math.max(back[i],back[j]+1);
				}
			}
		}
		
		//Find the biotonic sequence by storing the max.
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			int temp = front[i] + back[i]-1;
			if(max < temp){
				max = temp;
			}
			}
		System.out.println("The longest biotonic subsequence is " + max);
		}
		
	}

