/*Given a sack which can carry a total weight of x and given two arrays with weights and value. Determine
 * how to fill the sack so that it contains the max value.
 * 
 * Solution - It's pretty similar to the rod cutting problem.
 * 
 * 
 * 
 * 
 */
public class DPKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] weight = {10,20,30};
		int [] value = {60,100,120};
		int total_weight = 50;
		knapsack(total_weight,weight,value);
	}

	
	public static void knapsack(int total_weight, int[] weight, int[] value){
		
		//filling the first row and column with 0.
		
		int[][] arr = new int[weight.length+1][((total_weight)/10)+1];
		
		for(int i=0;i<=(total_weight)/10;i++){
			
			arr[0][i] =0;
		}
		
		for(int i=0;i<=weight.length;i++){
			
			arr[i][0] =0;
		}
		
		
		for(int i=1;i<=weight.length;i++){
			
			for(int j=1;j<=((total_weight)/10);j++){
				
				if(j*10 < weight[i-1]){
					
					//copy from the top.
					
					arr[i][j] = arr[i-1][j];
				}
				
				else {
					
					int inc_value = value[i-1] + arr[i][j-(weight[i-1]/10)];
					int exc_value = arr[i-1][j];
					arr[i][j] = Math.max(inc_value,exc_value);
				}
			}
		}
		
		System.out.println("The dp matrix is ");
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println(" ");
		}
	}
}
