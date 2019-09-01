
public class DPCoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total =5;
		int coin[] = {1,2,3};
		totalWays(coin,total);
		
	}

	
	public static void totalWays(int[] coin, int total){
		
		int[][] arr = new int[coin.length][total+1];
		
		//filling the rows and columns.
		arr[0][0] =0;
		for(int i=1;i<arr[0].length;i++){
			
			arr[0][i] = 1;
		}
		
		for(int i=0;i< arr.length;i++){
			
			arr[i][0] =1;
		}
		
		for(int i=1;i< arr.length;i++){
			
			for(int j=1;j<arr[0].length;j++){
				
				if(coin[i] > j){
					
					//copy from the top
					
					arr[i][j] = arr[i-1][j];
				}
				
				else {
					
					int exc = arr[i-1][j];
					int inc = arr[i][j-coin[i]];
					arr[i][j] = exc+inc;
				}
			}
		}
		
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println(" ");
		}
	}
	
	
}
