
public class MinimumPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {900,940,950,1100,1500,1800};
		int [] dep = {910,1200,1120,1130,1900,2000};
		minPlatforms(arr,dep);
	}
	
	
	public static void minPlatforms(int [] arr, int [] dep){
		
		int i=0;int j=0;
		int temp=0;
		int min_platforms=0;
		while(i<arr.length&&j< dep.length){
			
			if(arr[i]< dep[j]){
				
				temp++;
				i++;
			}
			
			else {
				
				temp--;
				j++;
			}
			if(temp>min_platforms){
				min_platforms = temp;
			}
			
		}
		
		System.out.println("Minimum platforms required " + min_platforms);
	}

}
