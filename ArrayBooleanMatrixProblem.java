/*Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) 
 * then make all the cells of ith row and jth column as 1. 
 * 
 * Solution - 
 * 
 * 
 */
public class ArrayBooleanMatrixProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int mat[][] = {{-4,-2147483648,6,-7,0},
				        {-8,6,-8,-6,0},
				        {2147483647,2,-9,-6,-10}};
		booleanMatrix(mat);
	}
	
	
	public static void booleanMatrix(int[][] arr){
		
		int row_flag =0;
		int column_flag =0;
		//setting row_flag
		for(int j=0;j <arr[0].length;j++){
			if(arr[0][j] ==0){
				 row_flag =1;
				 break;
			}
		}
		
		//setting column_flag
		for(int i=0;i <arr.length;i++){
			if(arr[i][0] ==0){
				 column_flag =1;
				 break;
			}
		}
		
		
		
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				
				if(arr[i][j] == 0){
					
					
					arr[0][j] =0;
					arr[i][0] =0;
				}
				
			}
			
		}
		
		//System.out.println(row_flag);
		//System.out.println(column_flag);
		int i=1;int j=1;
		while(i<arr.length){
			
			if(arr[i][0] ==0){
				
				while(j<arr[i].length){
				arr[i][j] =0;
				j++;
				}
			}
			j=0;
			i++;
		}
		//System.out.println("-----" + arr[2][0]);
		
		   i=1;j=1;
           while(j<arr[0].length){
			
			if(arr[0][j] ==0){
				while(i<arr.length){
				arr[i][j] =0;
				i++;
				}
			}
			i=0;
			j++;
		}
           
           
           if(row_flag ==1){
        	   
        	   //set the first row to 1
        	   
        	   for(j=0;j< arr[0].length;j++){
        		   
        		   arr[0][j]=0;
        	   }
           }
           
           
           if(column_flag ==1){
        	   
        	   //set the first column to 1
        	   
                for(i=0;i< arr.length;i++){
        		   
        		   arr[i][0]=0;
        	   }
           }
           //printing the matrix
           for(i=0;i< arr.length;i++){
        	   
        	   for(j=0;j<arr[i].length;j++){
        		   
        		   System.out.print(arr[i][j]);
        	   }
        	   
        	   System.out.println();
           }
	}

}
