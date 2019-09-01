
public class squareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=14;
		squareRoot(x);
	}

	public static void squareRoot(int x){
		
		if(x==0 || x==1){
			System.out.println("The square root is " + x);
			return;
		}
		
		int first =0;
		int last = x;
		
		int sqrt=0;
		
		while(first<=last){
			
			int mid = (first+last)/2;
			
			if(mid*mid==x){
				System.out.println("Square root is " + mid);
				return;
			}
			
			if(mid*mid < x){
				
				first = mid+1;
				sqrt = mid;
			}
			
			else if(mid*mid > x){
				last = mid-1;
			}
		}
		
		System.out.println("Square root is " + sqrt);
	}
}
