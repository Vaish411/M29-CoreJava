/*program to demonstrate on creating a thread by
 * extending a thread class
 */
package org.tnsif.multithreading;
public class ThreadProgram extends Thread{
	
	public void run()
	{
		System.out.println("Thread is in the running state");
	}
	
	

	public static void main(String[] args) {
		//ThreadProgram.run();
		
		ThreadProgram t=new ThreadProgram();
		t.start();
		/*if thraed is in the starting and running state, we can't start 
		 * again
		 */
		//t.start();

		
		

	}

}