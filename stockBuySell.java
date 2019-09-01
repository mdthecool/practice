
public class stockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {100, 180, 260, 310, 40, 535, 695};
		stockBuySell(arr);
	}
	
	
	public static void stockBuySell(int [] arr){
		
	  int buy = 0;
	  int count =0;
	  for(int i=1;i<arr.length;i++){
		  
		  if(arr[i] < arr[buy]){
			  if (count ==0){
				  
				  buy =i;
			  }
			  
			  else {
				  
				  count=0;
				  System.out.println("Buy " + buy);
				  System.out.println("Sell " + (i-1));
				  buy = i;
			  }
			 
		  }
		  count++;
		  
		  
	  }
	  
	  if(count!=0){
		  
		  System.out.println("Buy " + buy);
		  System.out.println("Sell " + (arr.length-1));
	  }
	}

}
