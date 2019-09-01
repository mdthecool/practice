/*Given an array of integers, where each integer represents the stock price on that day.
 * Find the max profit you can make by making at most k transactions. 2nd transaction can start only 
 * when the first transaction has finished.
 * 
 * Solution = Fill the 2D array, 1st row and column individually and then with include and exclude.
 * 
 * 
 */
public class DPStockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 22, 5, 75, 65, 80};
		int k=2;
		maxProfit(arr,k);
	}

	
	public static void maxProfit(int[] arr, int k){
		
		int temp[][] = new int[k+1][arr.length];
		for(int i=0;i< temp[0].length;i++){
			
			//fill the first row
			temp[0][i] =0;
			
		}
		
		for(int i=0;i < temp.length;i++){
			
			//filling the first column
			temp[i][0] = 0;
		}
		
		//Now filling the individual array.
		
		for(int i=1;i<temp.length;i++){
			
			for(int j=1;j< temp[0].length;j++){
			
				int exc = temp[i][j-1];
				int max_so_far =0;
				int l=0;
				
				while(l<j){
					
					if(max_so_far < temp[i-1][l] + arr[j]- arr[l]){
						
						max_so_far = temp[i-1][l] + arr[j]- arr[l];
					}
					l++;
				}
				
				temp[i][j] = Math.max(max_so_far,exc);
			}
		}
		
		//Now print the array.
		
		for(int i=0;i<temp.length;i++){
			System.out.println("");
			for(int j=0;j<temp[0].length;j++){
				
				System.out.print(temp[i][j] + " ");
			}
		}
		
		System.out.println("");
		System.out.println("Max profit = " + temp[temp.length-1][temp[0].length-1]);
		
	}
}
