/*
 * Given two rectangles, find if the given two rectangles overlap or not.

    Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates.
    l1: Top Left coordinate of first rectangle.
    r1: Bottom Right coordinate of first rectangle.
    l2: Top Left coordinate of second rectangle.
    r2: Bottom Right coordinate of second rectangle.
 * 
 * Solution - It may be assumed that the 
 * 
 * 
 * 
 */
public class DoRectanglesOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overlap(0,10,10,0,5,5,15,0);

	}
	
	
	public static void overlap(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
		
		
		if(x1<=x4 && x4 <= x2){
			
			//check for the y axis.
			if(y1>=y4 && y4>=y2){
				
				System.out.println("Rectangles overlap");
				return;
			}
			
			else{
				System.out.println("Rectangles don't overlap");
				return;
			}
		}
		
             if(x1<=x3 && x3 <= x2){
			
			//check for the y axis.
			if(y1>=y3 && y3>=y2){
				
				System.out.println("Rectangles overlap");
				return;
			}
			
			else{
				System.out.println("Rectangles don't overlap");
				return;
			}
		}
		
	}

}
