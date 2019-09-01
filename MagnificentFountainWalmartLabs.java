/*For example, say there are 4 fountains with firing intervals of 2, 3, 1, and 1 respectively, 
 * then if they fire all together at t=0, they will fire together again at t=6.
 * 
 * Solution - Find lcm
 * 
 * 
 * 
 */
public class MagnificentFountainWalmartLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,4,6,8};
		magnificentFountain(arr);
	}
	
	
	public static void magnificentFountain(int[] arr){
		
		boolean flag = false;
		int i=0;int count;
		while(flag==false){
			i++;count=0;
			for(int k=0;k<arr.length;k++){
				
				if(i%arr[k] ==0){
				count++;	
				}
				
				
			}
			
			if(count==arr.length){
				flag = true;
			}
			
		}
		
		System.out.println("The time is " + i);
	}

}
