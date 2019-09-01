












/*Given an assembly line containing n stops each. Find the most efficient path.
 * Link - https://www.geeksforgeeks.org/assembly-line-scheduling-dp-34/
 * 
 * 
 */
public class DPAssemblyLineScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e[] = {10, 12};//entry time
		int x[] = {18, 7}; //exit time
		int a[][] = {{4, 5, 3, 2}, 
                     {2, 10, 1, 4}}; 
		int t[][] = {{0, 7, 4, 5}, 
                     {0, 9, 2, 8}}; 
		
		assemblyLine(e,x,a,t);
	}

	
	public static void assemblyLine(int[] entry_time, int[] exit_time, int[][] time, int[][] transfer_time){
		
		
		int[] temp1 = new int[time[0].length];
		int[] temp2 = new int[time[0].length];
		
		temp1[0] = entry_time[0] + time[0][0];
		temp2[0] = entry_time[1] + time[1][0];
		
		for(int i=1;i<time[0].length;i++){
			
			temp1[i] = Math.min(temp1[i-1]+time[0][i],temp2[i-1]+ time[0][i]+transfer_time[1][i]);
			temp2[i] = Math.min(temp2[i-1]+time[1][i],temp1[i-1]+ time[1][i]+transfer_time[0][i]);
		}
		
		System.out.println("Min time taken = " + Math.min(temp1[time[0].length-1]+exit_time[0],temp2[time[0].length-1]+ exit_time[1]));
	}
	
}
