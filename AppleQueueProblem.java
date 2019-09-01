/*Total time taken to buy tickets.
 * 
 * Solution - total_time = time_front + time_back.
 * time_front = Math.min(arr[i],arr[j]) for all the people standing in front.
 * time_back  = Math.min(arr[i],arr[j]-1);
 * 
 * 
 * 
 */
public class AppleQueueProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3};
		tickets(arr,1);
	}

	//person is standing at the kth location.
	public static void tickets(int[] arr, int k){
		
	int front_time =0;
	int back_time =0;
		for(int i=0;i<k;i++){
			
			front_time = front_time + Math.min(arr[i],arr[k]);
		}
		
		for(int i=k+1;i<arr.length;i++){
			back_time = back_time + Math.min(arr[i],arr[k]-1);
		}
		
		System.out.println("Total time to take all the tickets " + (front_time+back_time+ arr[k]));
	}
}
