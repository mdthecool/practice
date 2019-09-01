/*A person can take 1 or 2 steps. What is the total possible n of ways a person can reach the nth step.
 * Solution - Create an array and fill the first with 1 and second with 2 as the total no of ways of reaching 
 * 1st step is 1 and 2nd step is 2 (1,1)(2)
 * 
 * Now for every next step ...total_steps[i]= total_steps[i-1] + total_steps[i-2]
 * 
 * To make it generic, if a person can take m steps 1,2,3,....m then 
 * 
 * arr[i] = arr[i-1]+ arr[i-2] + .....arr[i-m]
 * 
 * 
 * 
 */
public class DPNumberOfWaysSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noOfWays(20,2);
	}
	
	
	public static void noOfWays(int n,int k){
		
		if(n==1 || n==2){
			
			System.out.println("Total no of ways= " + n);
			return ;
		}
		
		
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 2;
		for(int i=2;i<n;i++){
			
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println("Total no of ways  = " + arr[n-1]);
	}

	
	
}
