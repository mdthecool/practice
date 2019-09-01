public class ReverseElementsInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		reverseArrayInGroup(arr,3);
			
	}
	
	
	public static void reverseArrayInGroup(int[] arr,int k){
		
		int left =0;
		int right =0;
		int temp;
		
		for(int i=0;i< arr.length;i=i+k){
			
			if(i+k<arr.length){
				
				right = i+k-1;
				left = i;
				
			}
			
			else {
				
				right = arr.length-1;
				left = i;
			}
			
			while(left<right){
				
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		//Printing the reversed array 
		System.out.println("The reversed array is ");
		for(int i=0;i < arr.length;i++){
			
			System.out.print(arr[i]);
			
		}
		
	}

}
