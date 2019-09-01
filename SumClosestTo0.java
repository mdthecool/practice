/*An Array of integers is given, both +ve and -ve. 
 * You need to find the two elements such that their sum is closest to zero.
 *Solution - Algorithm
1) Sort all the elements of the input array.
2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
3) sum = a[l] + a[r]
4) If sum is -ve, then l++
5) If sum is +ve, then r–
6) Keep track of abs min sum.
7) Repeat steps 3, 4, 5 and 6 while l < r
 *
 */
public class SumClosestTo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-67,-65,-37,-21,-18,4};
		sumClosestTo0(arr);
		
	}
	
	public static void sumClosestTo0(int[] arr){
	
		//Assuming that we get a sorted array.
		
		int i =0; int j= arr.length-1;
		int sum=Integer.MAX_VALUE;
		while(i<j){
			
			if(Math.abs(sum-0) > Math.abs((arr[i]+arr[j]))){
				
				sum = arr[i] + arr[j];
			}
			
			if((arr[i]+ arr[j]) < 0){
				
				i++;
			}
			
			else if ((arr[i]+ arr[j]) > 0){
				j--;
			}
		}
		
		System.out.println("The sum closest to 0 is " + sum);
		
	}

}
