package io.javabrains;

public class Greet {
	
/*	public void greetMethod(Greeting greeting) {
		System.out.println("Hello world");
	}
*/
	
	
//The above method was just printing hello world everytime we run the app.If we want the method to do
//	different actions based on the input
	
//	behaviour passed as an argument - 1.create a greeting interface2.write perform method 3.pass this method to greetMethod
	public void greetMethod(Greeting greeting) {
		greeting.perform();
	}

}
