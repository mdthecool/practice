
public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,5,7,3};
		leadersInArray(arr);

	}

	
	
	public static void leadersInArray(int[] arr){
		
		int max =-1;
		System.out.println("The leader elements are " );
		for(int i = arr.length-1;i>=0;i--){
			
			if(arr[i]>= max){
				
				System.out.println(arr[i]);
				max = arr[i];
			}
			
		}
	}
}
