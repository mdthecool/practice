/*A person is standing on the left most corner of 2d matrix. How many total paths are there to come down 
 * from top left t bottom right. He can move only right and down.
 * 
 * 
 * 
 */
public class DPTotalPathsMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		totalPaths(4,4);
		
	}

	
	
	public static void totalPaths(int rows, int cols){
		
		
		int arr[][] = new int[rows][cols];
		
		//fill the first row with 1s and fill the first cols with 1s
		for(int i=0;i<rows;i++){
			
			arr[i][0] = 1;
		}
		
		for(int j=0;j< cols;j++){
			
			arr[0][j] =1;
		}
		for(int i=1;i<rows;i++){
			
			for(int j =1;j< cols;j++){
				
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		System.out.println("Total no of ways to reach bottom = " + arr[rows-1][cols-1]);
	}
}
