import java.util.HashMap;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] arr = {1, 4, 20, 3, 10, 5};
		//subArrayWithGivenSum(arr,33);
		int[] arr1 = {10,1,6,9,20,60,-25,35};
		subArrayWithGivenSum(arr1,35);
		
	}
	
	
	public static void subArrayWithGivenSum(int[] arr, int sum){
		
		int curr_sum =0;
		int start_index =0;
		int end_index =0;
		int found =0;
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for (int i =0;i<arr.length;i++){
			
			curr_sum = curr_sum + arr[i];
			
			
			if(curr_sum == sum){
			found++;
			//means starting index is 0 and ending index is current index ie i	
			end_index =i;
			System.out.println("Sub Array start index is " + start_index);
			System.out.println("Sub Array end index is " + end_index);
			//return;
			}
			
			if(m.get(curr_sum-sum) != null){
				found++;
				start_index = m.get(curr_sum-sum) +1;
				end_index = i;
				System.out.println("Sub Array start index is " + start_index);
				System.out.println("Sub Array end index is " + end_index);
				//return;
			}
			
			m.put(curr_sum,i);
		}
		
		if(found==0){
		System.out.println("No sub array with given sum exists");
		}
	}

}
