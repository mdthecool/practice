
public class NearestPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nearestPerfectSquare(30);
	}
	
	
	public static int nearestPerfectSquare(int num){
		
		
		int low =0;
		int high = num;
		int mid = 0;
		int ans = 0;
		
		while(low<=high){
			
			mid = (low+high)/2;
			
			if(mid*mid == num){
				
				System.out.println("The nearest perfect square is "+ num);
				return num;
			}
			
			else if(mid*mid > num){
				
				high = mid-1;
			}
			
			else if(mid*mid < num){
				
				low = mid+1;
				ans = mid*mid;
			}
		}
		
		
		if((num - ans) > ((Math.sqrt(ans)+1)* (Math.sqrt(ans)+1)) -num){
			ans = (int) ((Math.sqrt(ans)+1)* (Math.sqrt(ans)+1));
			System.out.println("The nearest perfect square is " + ans);
			return ans;
			
		}
		
		System.out.println("The nearest perfect square is " + ans);
		return ans;
	}

}
