/*Given a 2d array, find the number of islands.
 * 
 * 
 * 
 */
public class NumberOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
		System.out.println("The number of islands are " + numberOfIslands(arr));
	}

	
	public static int numberOfIslands(int[][] arr){
		
		
		int count=0;
		boolean visited[][] = new boolean[arr.length][arr[0].length];
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				if(arr[i][j] == 1 && visited[i][j] == false){
					
					dfs(arr,i,j,visited);
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public static void dfs(int arr[][], int row,int col, boolean[][] visited){
		
		visited[row][col] = true;
		
		int[] row_arr = {-1,-1,-1,0,0,1,1,1};
		int[] col_arr = {-1,0,1,-1,1,-1,0,1};
		
		for(int k=0;k< row_arr.length;k++){
			
			if(isSafe(arr,row + row_arr[k],col+col_arr[k],visited)){
				
				dfs(arr,row + row_arr[k],col+col_arr[k],visited);
			}
		}
	}
	
	public static boolean isSafe(int[][] arr, int row, int col, boolean[][] visited){
		
		return (row < arr.length && row >=0 && col < arr[0].length && col >=0 && visited[row][col] == false && arr[row][col] == 1);
	}
}
