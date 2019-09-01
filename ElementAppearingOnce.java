
public class ElementAppearingOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		elementAppearingOnce(arr);

	}

	
	
	public static void elementAppearingOnce(int[] arr){
		
		for(int i=0;i<arr.length;i=i+2){
			
			if(arr[i]!=arr[i+1]){
				
				System.out.println("The element appearing only once is " + arr[i]);
				break;
			}
		}
	}
}
