
public class LinkedListIntersectionPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
		LinkedListNode n5 = new LinkedListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		

	}

	
	public static void intersectionPoint(LinkedListNode header1, LinkedListNode header2){
		
		int size1=0;
		int size2 =0;
		LinkedListNode temp1 = header1;
		LinkedListNode temp2 = header2;
		
		
		while(temp1 !=null){
			
			size1++;
			temp1 = temp1.next;
		}
		
        while(temp2 !=null){
			
			size2++;
			temp2 = temp2.next;
		}
		
        int count=0;
        if(size1 > size2){
        	
        	temp1 = header1;
        	temp2 = header2;
        	
        	while(count < (size1-size2)){
        		
        		temp1 = temp1.next;
        	}
        }
        
        else {
        	
        	temp1 = header1;
        	temp2 = header2;
        	
        	while(count < (size2-size1)){
        		
        		temp2 = temp2.next;
        	}
        }
		
		//now traverse both simultaneously
        
        while(temp1!=null && temp2!=null){
        	
        	if(temp1.next==temp2.next){
        		
        		System.out.println("The intersection data is " + temp1.next.data);
        		return;
        	}
        	
        	System.out.println("No intersection point");
        }
	}
}
