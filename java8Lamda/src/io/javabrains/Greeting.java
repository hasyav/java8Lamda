package io.javabrains;


// To make sure not to add any other methods to this interface as a landa expression is using this interface
//not madatory but a good practice

@FunctionalInterface
public interface Greeting {

	public void perform();
}
