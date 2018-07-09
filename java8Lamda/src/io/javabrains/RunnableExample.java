package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
//		implemented using anonymus inner class
		Thread myThread = new Thread(new Runnable()
				
				{
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
			
				}
				
				);
		// To start a thread use myThread.start() --- 		
		myThread.run();
		
		
//		since runnable interface has a single method - we can write a lamda expression on runnable interface matching the syntax
//		of run method(returns void and no arguments)
		Thread myLamdaThread = new Thread(()->System.out.println("Printed inside lamda runnable"));
		myLamdaThread.run();
	}
	
	
}
