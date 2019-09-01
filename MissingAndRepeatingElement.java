
public class MissingAndRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,4,5,3,6,6};
		missingAndRepeatingElement(arr);
	}

	
	
	public static void missingAndRepeatingElement(int[] arr){
		
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[Math.abs(arr[i])-1]<0){
				
				System.out.println("The repeated element is " + Math.abs(arr[i]));
			}
			
			else {
				
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
		}
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>0){
				System.out.println("The missing element is " + (i+1));
			}
		}
	}
}
