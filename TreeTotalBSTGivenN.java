/*Given an integer n , find the total number of BST that can be formed.
 * Solution - It's a catalan number 2n!/n1(n+1)!
 * 
 * 
 * 
 */
public class TreeTotalBSTGivenN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		total(6);
	}

	
	public static void total(int n){
		
		
		int m = (factorial(2*n)/(factorial(n)*factorial(n+1)));
		System.out.println(m);
	}
	
	public static int factorial(int n){
		
		int fact=1;
		for(int i=1;i<=n;i++){
			
			fact = fact*i;
		}
		
		return fact;
	}
}
