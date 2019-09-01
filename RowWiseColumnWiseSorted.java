
public class RowWiseColumnWiseSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		rowColumnWiseSorted(arr,-1);
	}
	
	
	public static void rowColumnWiseSorted(int[][] arr,int k){
		
		
		int i =0; 
		int j = arr[0].length-1;
		
		while(i< arr.length-1 && j >= 0){
			
			if(arr[i][j]==k){
				
				System.out.println("Element found at row " + (i+1) + " and column " + j);
				return;
			}
			if(arr[i][j] > k){
				
				j--;
			}
			
			else {
				
				i++;
			}
		}
		
		System.out.println("Element not found");
	}

}
