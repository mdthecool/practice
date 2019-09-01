
public class ArrayMinRemoveElementsSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,6,20,22,16,19,21};
		remove(arr);
	}
	
	
	
	public static void remove(int[] arr){
		
		int even_count=0;
		int odd_count =0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				
				even_count++;
			}
			
			else {
				
				odd_count++;
			}
	
		}
		
		System.out.println("Minimum no of removals " + Math.min(even_count,odd_count) );
	}
	
	
	

}
