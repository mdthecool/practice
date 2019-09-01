/*Given a 2d array , every cell contains a value. Traverse the cell from top left to bottom right such that
 * the sum of the values in the cells traversed have min value.
 * 
 * You can only move right and bottom.
 * 
 * Solution - For every cell, arr[i][j] = min(arr[i-1][j],arr[i][j-1]) + arr[i][j]
 * 
 * 
 * 
 * 
 */
public class DPMinSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};
		minSumPath(arr);
		

	}
	
	
	public static void minSumPath(int[][] arr){
		
		
		for(int i=1;i< arr.length;i++){
			
			arr[i][0]= arr[i-1][0] + arr[i][0];
		}
		
        for(int j=1;j< arr[0].length;j++){
			
			arr[0][j]= arr[0][j-1] + arr[0][j];
		}
		
		
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=1;j<arr[0].length;j++){
				
				
					
					arr[i][j] = Math.min(arr[i-1][j],arr[i][j-1]) + arr[i][j];
				
			
			}
		}
		
		System.out.println("The minimum path traversed is " + arr[arr.length-1][arr[0].length-1]);
	}

}
