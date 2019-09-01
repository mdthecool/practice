
public class ArrayPrintSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printSpiral(arr);

	}
	
	
	public static void printSpiral(int[][] arr){
		
		
		int start_row = 0;
		int end_row = arr.length-1;
		int start_col =0;
		int end_col = arr[0].length-1;
		
		while(start_row <end_row && start_col <end_col){
			
			for(int i=start_col;i<=end_col;i++){
				
				System.out.print(arr[start_row][i]);
			}
			
			start_row = start_row +1;
			
			for(int i=start_row;i<=end_row;i++){
				
				System.out.print(arr[i][end_col]);
			}
			
			end_col = end_col-1;
			
			if(start_row <=end_row){
				
				for(int i=end_col;i>=start_col;i--){
					
					System.out.print(arr[end_row][i]);
				}
				
				end_row = end_row-1;
				
				if(start_col<=end_col){
					
				 for(int i=end_row;i>=start_row;i--){
					 
					 System.out.print(arr[i][start_col]);
				 }
				 
				 
				}
				
				start_col = start_col+1;
			}
		}
	}

}
