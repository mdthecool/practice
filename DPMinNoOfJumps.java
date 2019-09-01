/*Given an array of integers where each element in the array determines the max no of steps you can take.
 * Find the min no of steps you need to reach the end of the array.
 * 
 * Solution - Take an array and set temp[0]=0.
 * 
 * 
 * 
 */


public class DPMinNoOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		minSteps(arr);

	}

	
	public static void minSteps(int[] arr){
		
		int[] temp = new int[arr.length];
		temp[0] = 0;
		for(int i=1;i<temp.length;i++){
			
			temp[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<i;j++){
				
				if(i==0){
					temp[i]=0;
				}
				
				else {
					
					if(i<=j+arr[j]){
						
						temp[i]= Math.min(temp[i],temp[j]+1);
					}
				}
				
			}
		}
		
		System.out.println("Min No Of steps required to reach the end -" + temp[temp.length-1]);
	}
}
