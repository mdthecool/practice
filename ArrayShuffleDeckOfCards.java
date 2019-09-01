import java.util.Random;

/*Given an array of numbers, shuffle it.
 * Solution - take the array as input. Find the random number betwee 0 to n-1 and then swap it with the n-1.
 * Now get random from 0 to n-2 and swap n-2. Continue this.
 * Complexity o(n)
 * 
 * 
 * 
 */
public class ArrayShuffleDeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8};
		shuffle(arr);
	}
	
	
	public static void shuffle(int[] arr){
		
		Random r;
		for(int i=arr.length-1;i>0;i--){
			
			r = new Random();
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		System.out.println("The shuffled array is ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

}
