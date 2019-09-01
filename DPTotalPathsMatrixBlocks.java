/*Given a m*n matrix, find the total no of ways to traverse the matrix. Some cells might be blocked and is detonated by
 * 0. You can only move right and bottom.
 * 
 * Solution - arr[i][j] = arr[i-1][j] + arr[i][j-1]. Add conditions for blockage.
 * 
 * 
 * 
 */
public class DPTotalPathsMatrixBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,1,1},{1,1,1},{0,1,0},{1,1,1}};
		totalWays(arr);

	}

	
	
	public static void totalWays(int[][] arr){
		
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i][0]==0){
				continue;
			}
			
			else{
				arr[i][0] = arr[i-1][0];
			}
		}
		
		for(int j=1;j< arr[0].length;j++){
			
			
			if(arr[0][j] ==0){
				continue;
			}
			
			else {
				
				arr[0][j] = arr[0][j-1];
			}
		}
		
		
		for(int i=1;i< arr.length;i++){
			
			for(int j=1;j< arr[0].length;j++){
				
				
				if(arr[i][j]==0){
					continue;
				}
				
				else {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
				
			}
		}
		
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j< arr[0].length;j++){
				
				System.out.print(arr[i][j]);
			}
			
			System.out.println("");
		}
		
		System.out.println("Total number of paths are " + arr[arr.length-1][arr[0].length-1]);
		
	}
	
}
