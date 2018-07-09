package io.javabrains;

public class Greeter {
	
	

	
public static void main(String[] args) {

//create instance of the class
Greet greet = new Greet();

// instantiate the interface based on implementation
//We can easily create an implementation for greeting interface
//Greeting hello = new HelloGreeting();

//lamdas are just isolated method that dont belong to any class-which can be treated as values
// We use lamda in java to add functional prohramming to java - no need to create a new class to implement
// the interface - just write a lamda expression for the class 
//The method in the interface should have the same return type and parameters as lamda expression
Greeting myLamdaFunction = ()->System.out.println("Hello lamda");


// execute the method in Greet class and passing a thing that has value
//It would be nice if we pass just value - we achieve this with lamda
greet.greetMethod(myLamdaFunction);
	}

}
