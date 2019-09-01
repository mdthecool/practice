
public class MeeshoBeauty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,1,2,2};
		beauty(arr,2);
	}
	
	
	public static void beauty(int[] arr,int k){
		
		
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		int diff = Integer.MAX_VALUE;
		for(int i=0;i< arr.length;i++){
			
			if(arr[i] == k){
				
				if(a==Integer.MIN_VALUE){
					a=i;
					//System.out.println("a-" + a);
				}
				else {
					
					b=i;
					//System.out.println("b-" + b);
					
					if(diff > (b-a)) {
						//System.out.println("diff-" + diff);
						diff = Math.abs(b-a);
					}
				}
				
				if(b!=Integer.MIN_VALUE){
					a=b;
					b=Integer.MIN_VALUE;
				}
				
			}
		}
		
		System.out.println("The diff is " + diff);
		
	}

}
