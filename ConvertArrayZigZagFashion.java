
public class ConvertArrayZigZagFashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4, 3, 7, 8, 6, 2, 1};
		zigzagArray(arr);
	}

	
	public static void zigzagArray(int[] arr){
		
		boolean flag = false;
		for(int i =0;i< arr.length-1;i++){
			
			if(!flag){
				
				if(arr[i]>arr[i+1]){
					
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
			
			else {
				
				if(arr[i] < arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
			flag = !flag;
			}
		
		System.out.println("The zig zag array is ");
		for(int i =0;i< arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
			
		}
	}

