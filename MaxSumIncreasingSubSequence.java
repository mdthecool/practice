
public class MaxSumIncreasingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {4,6,1,8,4,6};
		maxSumIncreasingSubSequence(arr);
	}

	
	
	public static void maxSumIncreasingSubSequence(int[] arr){
		
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			temp[i] = arr[i];
		}
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=0;j<i;j++){
				
				if(arr[i] > arr[j] && temp[i] < temp[j] + arr[i]){
					
					temp[i] = temp[j] + arr[i];
				}
			}
		}
		
		for(int i=0;i< temp.length;i++){
			
			System.out.print(temp[i] + " ");
		}
	}
}
