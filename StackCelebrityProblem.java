import java.util.Stack;

/*Given a 2D array where each element represents whether the perosn in ith row knows the person in jth column 
 * or not. Find the celebrity. The celebrity doesn't know anyone but every one know the celebrity.
 * 
 * {{0, 0, 1, 0}, 
    {0, 0, 1, 0}, 
    {0, 0, 0, 0}, 
    {0, 0, 1, 0}}; 
 * 
 * In the above problem, C is the celebrity as everybody knows him and he doesn't know anyone.
 * 
 * Solution - We can traverse the matrix to find the row with all 0s. Then also make sure that the column for it
 * has 1s everywhere. But this is an n square solution.
 * A better way to deal with the problem is to take a stack and push all the members into it. Pop two elements from
 * the stack. Let's say 0 and 1 . If 0 knows 1 then 0 cannot be the celebrity. Discard 0, else discard 1. Push 
 * the remaining to stack. Do this for all the elements. In the end you will be left with only one member in the
 * stack. Check if that member is a celebrity by traversing the column and row.
 * 
 */
public class StackCelebrityProblem {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		
		int[][] arr = {{0, 0, 1, 0}, 
			    {0, 0, 1, 0}, 
			    {0, 0, 0, 0}, 
			    {0, 0, 1, 0}}; 
		
		celebrity(arr);

	}

	
	public static void celebrity(int[][] arr){
		
		//create a stack and push all members in it.
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<arr.length;i++){
			
			s.push(i);
		}
		
		while(s.size()!=1){
			
			//take the first two 
			int a = s.pop();
			int b= s.pop();
			boolean c = knows(a,b,arr);
			if(c==true){
				//discard a and push b back to stack
				s.push(b);
				
			}
			else {
				s.push(a);
			}
		}
		int temp = s.pop();
		//Now check whether that element is indeed a celebrity.
		//all columns in that row must be 0
		for(int i=0;i<arr.length;i++){
			if(arr[temp][i] !=0){
				System.out.println("No Celebrity");
				return;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i][temp] !=1){
				if(i!=temp){
				System.out.println("No Celebrity");
				return;
				}
			}
		}
		System.out.println("The celebrity is " + temp);
	}
	
	public static boolean knows(int a,int b,int[][] arr){
		
		if(arr[a][b]==1){
			return true;
		}
		else {
			return false;
		}
	}
}
