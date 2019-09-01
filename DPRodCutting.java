/*Given a road of length n. Two arrays are given one is the length array and the other is the value for each
 * length. What is the max profit that you can make ?
 * Solution - We will make use of dp to slve this problem.
 * 
 * 
 * 
 * 
 */
public class DPRodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int total_length = 8;
	    int [] arr = {1,5,8,9,10,17,17,20};
	    */
		
		int total_length =8;
		int lengths[] = {1,2,3,4,5,6,7,8};
		int values[] = {1,5,8,9,10,17,17,20};
		
		rodCutting(lengths,values,total_length);

	}

	
	public static void rodCutting(int [] lengths,int[] values, int total_length){
		
		//filling the first row.
		int[][] dp_arr = new int[lengths.length][total_length+1];
		
		for(int j=1;j<total_length+1;j++){
			
			if( j < lengths[0]){
				
				//fill with 0
				dp_arr[0][j] =0;
				
			}
			
			else {
				
				dp_arr[0][j] = (j/lengths[0]) * values[0];
			}
			
		}
		
		//filling the first column
		
		for(int i=0;i<lengths.length;i++){
			
			dp_arr[i][0] = 0;
		}
		
		
		for(int i=1;i<lengths.length;i++){
			
			for(int j=1;j<total_length+1;j++){
				
				
				if(j< lengths[i]){
					
					//copy from above
					dp_arr[i][j] = dp_arr[i-1][j];
				}
				
				else {
					
					
					dp_arr[i][j] = Math.max(dp_arr[i-1][j],values[i] + dp_arr[i][j-lengths[i]]);
				}
			}
		}
		
		System.out.println("The matrix is ");
		for(int i=0;i<lengths.length;i++){
			
			System.out.println("");
			
			for(int j=0;j< total_length+1;j++){
				
				System.out.print(dp_arr[i][j] + " ");
				
			}
		}
	}
}
