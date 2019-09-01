
public class ArrayConsecutive1sInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n =5;
		consecutive(n);
	}

	
	public static void consecutive(int n){
		int count =0;
		int counter=0;
		
		for(int i=0;i< Math.pow(2,n);i++){
			
			count=0;
			
			for(int j=0;j<n;j++){
				
				if((i & 1<<j) > 0){
					
					count++;
				}
				else {
					count=0;
				}
				
				if(count>1){
					break;
				}
			}
			
			if(count>=2){
				counter++;
				System.out.println(i);
			}
		}
		
		System.out.println("The total count is " + counter);
	}
}
