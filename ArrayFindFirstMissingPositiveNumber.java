/*Given an array of integers (negative ad positive), find the first missing positive number.
 * 
 * Solution - segreagate the negative and the positive number. And apply (making integers negative technique) on the
 * positive integers.
 * 
 * 
 * 
 * 
 */
public class ArrayFindFirstMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 2, 3, -7, 6, 8, 1, -10, 15 };
		missingNumber(arr);

	}
	
	
	
	public static void missingNumber(int[] arr){
		
	
		//first sort the array so that all negative are on the left and positive on right
		
	   int i=0; int j=arr.length-1;
	   
	   while(i<=j){
		   
		   if(arr[i]<0 && arr[j]>0){
			  
			   i++;
			   j--;
		   }
		   
		   else if(arr[i]<0 && arr[j]<0){
			   
			   i++;
		   }
		   
		   else if(arr[i]> 0 && arr[j]>0){
			  
			   j--;
		   }
		   
		   
		   else if(arr[i] >0 && arr[j] <0){
			  
			   //swap.
			   
			   int temp = arr[i];
			   arr[i]=arr[j];
			   arr[j] = temp;
			   i++;
			   j--;
		   }
		   
		  
	   }
	   
	   System.out.println("The segregate array is ");
	   for(int k=0;k< arr.length;k++){
		   
		   System.out.print(arr[k] + " ");
	   }
	   
	   System.out.println(" ");
	   System.out.println("The starting positive index is " + i);
	   
	   //First positive number starts from i
	   
	   for(int k=i;k<arr.length;k++){
		   
		   if(Math.abs(arr[k])+i-1 > arr.length-1){
			   
			   //don't do anything 
			   continue;
		   }
		   
		   else {
			   
			   arr[Math.abs(arr[k]) +i-1] = -arr[Math.abs(arr[k])+i-1];
		   }
	   }
	   
	   
	   System.out.println(" ");
       for(int k=0;k< arr.length;k++){
		   
		   System.out.print(arr[k] + " ");
	   }
	   
        for(int k=i;k< arr.length;k++){
		   
		   if(arr[k]>0){
			   System.out.println("Missing element is " + (k-i+1));
			   break;
		   }
	   }
	}

}
