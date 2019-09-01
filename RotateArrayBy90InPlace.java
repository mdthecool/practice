/*Given a N*N array, rotate the array by 90 degrees in place.
 * Solution - Two things to remember. For a N*N array , the no of cycles (the outer loop) required will be N/2
 * The inner loop will be from x to N-1-x. Then write the code to swap the corner elements taking a temp variable, 
 * the rest will work
 * by itself.
 * 
 * 
 * 
 * 
 */
public class RotateArrayBy90InPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotation(arr);

	}

	
	public static void rotation(int[][] arr){
		
		int n = arr.length;
		

		System.out.println("Array before rotation ");
		
		for(int x=0;x<n;x++){
			
			System.out.println("");
			for(int y=0;y<n;y++){
				
				System.out.print(arr[x][y] + " ");
			}
		}
		System.out.println(" ");
		for(int x=0;x< (n/2); x++){
			
			for(int y=x;y<n-1-x;y++){
				
				int temp = arr[x][y];
				arr[x][y] = arr[y][n-1-x];
				arr[y][n-1-x] = arr[n-1-x][n-1-y];
				arr[n-1-x][n-1-y] = arr[n-1-y][x];
				arr[n-1-y][x] = temp;
			}
		}
		
		System.out.println("The rotated array is ");
		
		for(int x=0;x<n;x++){
			
			System.out.println("");
			for(int y=0;y<n;y++){
				
				System.out.print(arr[x][y] + " ");
			}
		}
	}
}
