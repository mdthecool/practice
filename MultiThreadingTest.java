
class MultiThreadingEvenOdd {

	boolean even =false;
	public void printEven(int number,String ThreadName) throws InterruptedException{
		
		while(number <10){
		if(!even){
			System.out.println(ThreadName + "- waiting");
			synchronized(this){
				wait();
				}
		}
		
		System.out.println("Printing even number from thread -" + ThreadName + " " + number);
		synchronized(this){
			notifyAll();
			}
		
		even = false;
		number=number+2;
		}
		
	}
	
	 public void printOdd(int number,String ThreadName) throws InterruptedException{
		
		while(number<10){
		if(even){
			System.out.println(ThreadName + "- waiting");
			synchronized(this){
				wait();
				}
			
		}
		System.out.println("Printing odd number from Thread- "  + ThreadName + " "+ number);
		synchronized(this){
		notifyAll();
		}
		even = true;
		number=number+2;
		
		}
	}
	
}
	
	class myThread extends Thread {
		
		MultiThreadingEvenOdd m;
		boolean even;
		
		myThread(MultiThreadingEvenOdd m,boolean even){
			this.m = m;
			this.even = even;
		}
		
		public void run(){
			
		if(even){
		   try {
			m.printEven(2,Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			try {
				m.printOdd(1,Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	
	public class MultiThreadingTest{
		
		public static void main(String args[]){
		
	    MultiThreadingEvenOdd mev = new MultiThreadingEvenOdd();
	    
		myThread m1 = new myThread(mev,false);
		myThread m2 = new myThread(mev,true);
		m1.start();
		m2.start();
		}
	}

