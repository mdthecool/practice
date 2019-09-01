/*There are n houses build in a line, each of which contains some value in it.
 *  A thief is going to steal the maximal value of these houses, but he can’t steal 
 * in two adjacent houses because owner of the stolen houses will tell his two neighbour left and right side. 
 * What is the maximum stolen value.
 * 
 * Solution - 
 * 
 * 
 * 
 * 
 */
public class DPMaxPossibleStolenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6, 7, 1, 3, 8, 2, 4};
		maxStolenValue(arr);
		
	}
	
	public static int maxStolenValue(int[] arr){
		
		if(arr.length==0){
			return -1;
		}
		
		else if(arr.length==1){
			return arr[0];
		}
		
		
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		temp[1] = arr[1];
		
		for(int i=2;i<arr.length;i++){
			temp[i] = Integer.MIN_VALUE;
		}
		
		for(int i=2;i< arr.length;i++){
			
			for(int j=0;j<i-1;j++){
				
				temp[i] = Math.max(temp[i],temp[j] + arr[i]);
				
			}
			
		}
		
		System.out.println("The temp array is ");
		int max= Integer.MIN_VALUE;
		
		for(int i=0;i <temp.length;i++){
			if(max < temp[i]){
				max = temp[i];
			}
			System.out.print(temp[i] + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("The max value is " + max);
		return max;
	}

}
