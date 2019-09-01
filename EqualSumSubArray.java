
public class EqualSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,1,2,3};
		equalSumSubArray(arr);
	}
	
	
	public static void equalSumSubArray(int[] arr){
		
		//add the sum till the index in the sum array
		
		int[] sum = new int[arr.length];
		int s =0;
		for(int i=0;i<arr.length;i++){
			
			s = s+arr[i];
			sum[i] = s;
			
		}
		
		for(int i=0;i<sum.length;i++){
			
			System.out.print(sum[i] + " ");
		}
		
		System.out.println("");
		//Now traverse the array and check for the largest subarray
		int max_subarray =0;
		for(int i=0;i< sum.length;i++){
			
			for(int j=i+1;j<sum.length;j=j+2){
				
				
				
				
				if(i-1>=0){
				if((sum[j]-sum[i-1]) == (2*(sum[j]-sum[(i+j)/2]))){
					
					
					System.out.println("Sub Array found");
					System.out.println("First half sum = " + (sum[j]-sum[i-1])/2);
					System.out.println("Start index " + i);
					System.out.println("End index " + j);
					
					if((j-i+1) > max_subarray){
						
						max_subarray = j-i+1;
					}
				}
				}
				
				else {
					
					if((sum[j] == (2*(sum[j]-sum[(i+j)/2])))){
						
						
						System.out.println("Sub Array found");
						System.out.println("First half sum = " + (sum[j]-sum[(i+j)/2]));
						System.out.println("Start index " + i);
						System.out.println("End index " + j);
						
						if((j-i+1) > max_subarray){
							
							max_subarray = j-i+1;
						}
					}
					
				}
				
			}
		}
		
		System.out.println("Max subbaraay length is " + max_subarray);
	}

}
