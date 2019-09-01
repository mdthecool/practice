import java.util.Collections;

/*You are given four operations
 * a) Type A
 * b) Ctrl A
 * c) Ctrl C
 * d) Ctrl V
 * 
 * Find max number of As you can print on the screen for a given n, where n defines the no of times you can
 * press the key.
 * 
 * 
 * 
 */
public class DPMaxAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxAs(20);
	}

	
	
	public static void maxAs(int n){
		
		int[] arr = new int[n+1];
		if(n<7){
			
			System.out.println("Max no of A =" + n);
			return;
		}
		for(int i=1;i<=6;i++){
			
			arr[i]=i;
		}
		
		//Now start filling from 7th.
		for(int i=7;i<=n;i++){
			
			int max=Integer.MIN_VALUE;
			int count=2;
			
			for(int j=i-3;j>=1;j--){
				
				if(max<(arr[j]*count)){
					max = (arr[j]*count);
					
				}
				
				count++;
			}
			
			arr[i] = max;
		}
		
		System.out.println("The max value is " + arr[n]);
	}
}
