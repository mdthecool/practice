/*Given an integer n, calculate the number of strings of length you can create with all the vowels
 * such that the stirng is in alphabetical order.
 * 
 * Solution - Simple dp
 * 
 * arr[i][j] = arr[i-1][j] + arr[i][j-1]
 * 
 * 
 * 
 * 
 */
public class DPVowelsProblemSirionLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		ways(5);
	}
	
	
	public static void ways(int n){
		
		
		int[][] arr = new int[n][5];
		
		//filling 1st column with 1
		for(int i=0;i<arr.length;i++){
			
			arr[i][0] =1;
		}
		
		for(int i=0;i<arr[0].length;i++){
			
			arr[0][i] = i+1; 
		}
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=1;j<arr[0].length;j++){
				
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		//printing the array.
           for(int i=0;i<arr.length;i++){
			
        	   System.out.println(" ");
			for(int j=0;j<arr[0].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}

}
