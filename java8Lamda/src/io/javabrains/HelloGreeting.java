package io.javabrains;

public class HelloGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World");
	}

}
