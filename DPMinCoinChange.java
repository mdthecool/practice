/*Given a total value and the coin array , what is the minimum no of coins you would need to make the value.
 * 
 * 
 * 
 */
public class DPMinCoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coin = {1,5,6,8};
		int total =11;
		minCoinChange(coin,total);
	}

	
	public static void minCoinChange(int[] coin,int total){
		
		
		int[][] arr = new int[coin.length+1][total+1];
		
		//filling the first row and the first column.
		
		for(int i=0;i<=total;i++){
			
			arr[0][i] =Integer.MAX_VALUE;
		}
		
		for(int j=0;j<coin.length;j++){
			
			arr[j][0] =0;
		}
		
		//Now filling the rest of the matrix
		
		for(int i=1;i<=coin.length;i++){
			
			for(int j=1;j<=total;j++){
				
				if(j<coin[i-1]){
					
					//copy from the top
					arr[i][j] = arr[i-1][j];
				}
				
				else {
					
					int inc = 1+arr[i][j-coin[i-1]];
				    int exc = arr[i-1][j];
					arr[i][j] = Math.min(inc,exc);
				}
			}
		}
		
		System.out.println("The dp matrix is ");
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j< arr[0].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println(" ");
		}
	}
}
