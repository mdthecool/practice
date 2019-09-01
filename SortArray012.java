
public class SortArray012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,1,2,2,2,2,1,1,1,0,0,1};
		sort012(arr);
		dutchNationalFlag(arr);
	}

	
	
	public static void sort012(int[] arr ){
		
		int zero_count =0;
		int one_count =0;
		int two_count =0;
		
		for(int i=0;i< arr.length;i++){
			
			if(arr[i]==0){
				zero_count++;
			}
			else if (arr[i]==1){
				
				one_count++;
			}
			
			else {
				
				two_count++;
			}
			
			
		}
		
		for(int i=0;i<zero_count;i++){
			
			arr[i]=0;
		}
		
		for(int i=zero_count;i<(zero_count+one_count);i++){
			
			arr[i]=1;
		}
		
        for(int i=(zero_count+one_count);i<(zero_count+one_count+two_count);i++){
			
			arr[i]=2;
		}
		
        System.out.println("The sorted array is ");
        for(int i =0;i< arr.length;i++){
        	
        	System.out.print(arr[i] + " ");
        }
		
	}
	
	public static void dutchNationalFlag(int[] arr){
		
		int low = 0;
		int mid =0;
		int high = arr.length-1;
		
		while(mid <=high){
			
			if(arr[mid]==1){
				
				mid++;
			}
			
			else if (arr[mid] ==0){
				
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}
			
			else if(arr[mid]==2){
				
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		
		System.out.println("");
		 System.out.println("The sorted array is ");
	        for(int i =0;i< arr.length;i++){
	        	
	        	System.out.print(arr[i] + " ");
	        }
	}
}
