/*Given an array , find if there are numbers in the array that can add upto k.
 * Solution - It's a dp problem. Create a 2d array and fill those with 1 (True) and false (0)
 * 
 * 
 * 
 * 
 * 
 */
public class DPSubSetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total =9;
		int arr[] = {3,34,4,12,5,2};
		subsetSum(total,arr);
	}

	
	public static void subsetSum(int total,int[] arr){
		
		int [][] dp_arr = new int[arr.length][total+1];
		
		//fill the first row 
		
		for(int j=1;j<=total;j++){
			
			if(arr[0] == j){
				
				dp_arr[0][j] =1;
			}
			
			else {
				dp_arr[0][j] = 0;
			}
		}
		
		//fill the first column with 1s
		
		for(int i=0;i< arr.length;i++){
			
			dp_arr[i][0] =1;
		}
		for(int i=1;i<arr.length;i++){
			
			for(int j=1;j<=total;j++){
				
				if(arr[i] > j){
					
					//take the value from the top
					dp_arr[i][j] = dp_arr[i-1][j];
				}
				
				else { 
					if(dp_arr[i-1][j-arr[i]] ==1 || dp_arr[i-1][j]==1){
						
						dp_arr[i][j] =1;					
				}
				
					else {
						dp_arr[i][j] =0;
					}
				}
			}
		}
		
		System.out.println("The 2d array is ");
		for(int i=0;i<arr.length;i++){
			
			System.out.println(" ");
			for(int j=0;j<=total;j++){
				
				System.out.print(dp_arr[i][j] + " ");
			}
		}
	}
}
