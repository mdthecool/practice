/*Given an array of integers, can you divide the array into two parts such that the sum of 
 * the two parts are same.
 * 
 * Solution - Calculate the sum of the array and divide by 2. If the answer is odd return false;
 * Else, proceed with subset sum problem 
 * 
 * 
 */
public class DPPartitioningProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 5, 11, 5};
		partition(arr);
	}

	
	public static int partition(int[] arr){
		
		int sum =0;
		for(int i=0;i<arr.length;i++){
			
			sum = sum + arr[i];
		}
		
		
		if(sum%2!=0){
			
			return 0;
		}
		sum = sum/2;
		//start filling the array in bottom up manner.
		int temp[][] =  new int[arr.length][sum+1];
		//filling the first row
		for(int i=0;i<=sum;i++){
			if(arr[0] == i){
				
				temp[0][i] = 1;
			}
			
			else {
				
				temp[0][i] =0;
			}
		}
		
		//filling the first column
		
		for(int i=0;i<arr.length;i++){
			temp[i][0] = 1;
		}
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=1;j<=sum;j++){
				
				if(arr[i] > j){
					
					temp[i][j] = temp[i-1][j];
				}
				
				else {
					int inc = temp[i][j-arr[i]];
					int exc = temp[i-1][j];
					temp[i][j] = Math.max(inc,exc);
				}
			}
		}
		
		//printing now 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=sum;j++){
				System.out.print(temp[i][j] + " ");
			}
			
			System.out.println();
		}
		
		return temp[arr.length-1][sum];
	}
}
