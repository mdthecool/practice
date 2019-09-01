/*Given an array where each integer represents the height of the building, calculate the water stored.
 * Assume the width of the building to be 1.
 * 
 * Solution - Water stored for each building is Min(left_max, right_max)- height of the building.
 * 
 * 
 * 
 */
public class RainWaterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 0, 0, 2, 0, 4};
		tappedWater(arr);

	}
	
	
	public static void tappedWater(int[] arr){
		
		//calculating the left max.
		
		int[] left_max = new int[arr.length];
		int[] right_max = new int[arr.length];
		
		left_max[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]< left_max[i-1]){
				
				left_max[i]= left_max[i-1];
			}
			
			else {
				
				left_max[i] = arr[i];
			}
			
		}
		
            for(int i=0;i< arr.length;i++){
        	 
        	 System.out.print(left_max[i] + " ");
         }
		 System.out.println(" ");
		 right_max[arr.length-1] = arr[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
			
			if(arr[i]< right_max[i+1]){
				
				right_max[i]= right_max[i+1];
			}
			
			else {
				
				right_max[i] = arr[i];
			}
			
		}
         
         for(int i=0;i< arr.length;i++){
        	 
        	 System.out.print(right_max[i] + " ");
         }
         System.out.println(" ");
         //Now calculate the water trapped for each building.
         int water_trapped=0;
         for(int i=0;i< arr.length;i++){
        	 
        	
        	 
        	 water_trapped = water_trapped +(Math.min(left_max[i],right_max[i])-arr[i]);
        	 
         }
         
         System.out.println("Water trapped = " + water_trapped);
	}

}
