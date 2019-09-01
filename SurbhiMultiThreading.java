
public class SurbhiMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Surbhi s = new Surbhi();
		
		myT m1 = new myT(s,false);
		myT m2 = new myT(s,true);
		m1.start();
		m2.start();
		
	}
	
}
	class Surbhi {
		
		
		synchronized public void delete () throws InterruptedException{
			
			{
				
				System.out.println("I am inside delete method");
				System.out.println("I am sleeping inside delete");
				Thread.sleep(5000);
				System.out.println("woken up inside delete");
			}
			
		}
		
        public void update () throws InterruptedException{
			
			{
				
				System.out.println("I am inside update method");
				Thread.sleep(5000);
				System.out.println("I am sleeping inside update");
				Thread.sleep(5000);
				System.out.println("woken up inside update");
			}
			
		}
		
		
	}
	
	class myT extends Thread {
		Surbhi s;
		boolean update;
		myT(Surbhi s, boolean update){
		
			this.s = s;
			this.update = update;
			
		}
		public void run(){
			
			if(update){
				try {
					s.update();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else {
				try {
					s.delete();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


