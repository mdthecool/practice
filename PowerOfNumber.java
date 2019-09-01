/*Given a number and a power x, calculate the power of n to x in logn time.
 * Solution - x to the power n is x to the power n/2 * x to the power n/2
 * 
 * 
 * 
 * 
 */
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = pow(2,5);
		System.out.println("The power of the number is " + res);
	}

	
	
	public static int pow(int x,int n){
		
		
		//base condition 
		if(n==0){
			
			return 1;
		}
		
		if(n==1){
			
			return x;
		}
		
		int temp = pow(x,n/2);
		
		if(n%2==0){
			
			return temp*temp;
		}
		
		else {
			return x*temp*temp;
		}
		}
	}

