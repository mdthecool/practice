


public class HackerRankBdayCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {18,90,90,13,90,75,90,8,90,43};
		birthdayCakeCandles(arr);
	}

	
	static int birthdayCakeCandles(int[] ar) {
	       int max = -1;
	       for(int i=0;i<ar.length;i++){
	            if(max < ar[i]){

	                max = ar[i];
	            }

	       }
	        System.out.println(max);
	       int count =0;
	       for(int i=0;i< ar.length;i++){
	            if(max==ar[i]){
	                count = count+1;
	            }
	             
	       }
	       return count;
	    }
}
