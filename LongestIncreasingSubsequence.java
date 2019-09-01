/*Given an array, tell the longest increasing sub sequence in the array.
 * Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20
 * 
 * 
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {10,22,9,33,21,50,41,60,80};
		increasingSubSequence(arr);
	}
	
	
	public static void increasingSubSequence(int[] arr){
		
		int [] temp = new int[arr.length];
		//Fill the temp array with 1
		for(int i=0;i<arr.length;i++){
			
			temp[i] =1;
			
		}
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=0;j<i;j++){
				
				if(arr[j] < arr[i] && temp[i] < temp[j]+1){
					
					temp[i] = temp[j] +1;
				}
			}
		}
	
		
	for(int i=0;i<temp.length;i++){
		System.out.print(temp[i] + " " );
		
		
	}
		
	}

}
