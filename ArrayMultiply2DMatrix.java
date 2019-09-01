
public class ArrayMultiply2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{1, 1, 1, 1}, 
                {2, 2, 2, 2}, 
                {3, 3, 3, 3}, 
                {4, 4, 4, 4}}; 
		int [][] b = {{1, 1, 1, 1}, 
                {2, 2, 2, 2}, 
                {3, 3, 3, 3}, 
                {4, 4, 4, 4}}; 
		multiply(a,b);
		
	}
	
	
	public static void multiply(int[][] a,int[][] b){
		
		
		 //no of columns in a should be equal to no of rows in b
		
		int c[][] = new int[a.length][b[0].length];
		if(a[0].length != b.length){
			
			System.out.println("Matrix cannot be multiplied");
		}
		for(int i =0;i<a.length;i++){
			
			for(int j=0;j<b[0].length;j++){
				
				for(int k=0;k<b.length;k++){
					
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		
		
		System.out.println("The multiplied matrix is ");
		
		for(int i=0;i< c.length;i++){
			
			System.out.println("");
			for(int j=0;j<c[0].length;j++){
				
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
