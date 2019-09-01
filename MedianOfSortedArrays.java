/*Given two arrays of equal sizes. Find the median of the arrays.
 * 
 * Note the below solution will only work 
 * Solution = if there are 2 elements in each array 
 * a1,a2
 * b1,b2
 * 
 * the resultant median would be max(a1,b1) + min(a2,b2)/2
 * 
 * if the array contains only one element then median is
 * a1
 * b1
 * 
 * a1+b1/2
 * 
 * if more than 2 elements are present 
 * a1,a2,m1,a4,a5
 * b1,b2,m2,b4,b5
 * 
 * if(m1 < m2) - ignore the first half of array1 and the second half of array2. else vice versa.
 * 
 * 
 * 
 * 
 */
public class MedianOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,12,15,26,38};
		int[] arr2 = {2,13,17,30,45};
	}
	
	
	public static void getMedian(int arr1, int arr2,int start1, int end1, int start2,int end2){
		
		if(end1-start1==0){
		
		}
	}

}
