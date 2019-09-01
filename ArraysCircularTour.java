/*Given a circulr tour with petrol pump and distance to the next petrol pump
 * Find the first pertol pump which can cover the entire distance.
 * 
 * 
 * 
 */
public class ArraysCircularTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] petrol = {4,6,7,4};
		int[]  distance = {6,5,3,5};
		circularTour(petrol,distance);

	}
	
	
	public static void circularTour(int[] petrol, int[] distance){
		int start = 0;
		int end = 0;
		int diff = 0;
		
		int curr_petrol =0;
		while(start < petrol.length){
			
		    diff = petrol[end%petrol.length]-distance[end%petrol.length];
		    curr_petrol = curr_petrol + diff;
		    
		    if(curr_petrol < 0){
		    	
		    	start = end+1;
		        end =end+1;
		        curr_petrol = 0;
		    }
		    
		    else {
		    	
		    	end = end+1;
		    	
		    	if(start == (end%petrol.length)){
		    		
		    		System.out.println("Starting point is " + start);
		    		return;
		    	}
		    }
		    	
		}
		
		System.out.println("No starting pump found ");
	}

}
