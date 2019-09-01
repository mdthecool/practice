
public class ArrayMultiplyWalmartQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		multiply(arr);
	}

	
	public static void multiply(int[] arr){
		
		int[] left_arr = new int[arr.length];
		int[] right_arr = new int[arr.length];
		
		left_arr[0] = arr[0];
		for(int i=1;i< arr.length;i++){
			
			
		    left_arr[i] = left_arr[i-1] * arr[i];	
		}
		
		right_arr[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
			
		    right_arr[i] = right_arr[i+1] * arr[i];	
		}
        
        System.out.println("The multiplied array is ");
        System.out.print(right_arr[1] + " ");
        for(int i=1;i<arr.length-1;i++){
        	
        	System.out.print((left_arr[i-1] * right_arr[i+1]) + " ");
        	
        	
        }
        
        System.out.print(left_arr[arr.length-2]);
	}
}
