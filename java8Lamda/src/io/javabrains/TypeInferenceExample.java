package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLamda myLamda = (String s)-> s.length();
		myLamda.getLength("Hello Lalmda");
		System.out.print(myLamda.getLength("Hello Lalmda"));
		
	}
	
	interface StringLengthLamda{
		int getLength(String s);
	}

}
