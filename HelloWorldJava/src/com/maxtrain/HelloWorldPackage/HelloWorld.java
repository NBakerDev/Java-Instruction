package com.maxtrain.HelloWorldPackage;

public class HelloWorld {

	
	public static void main(String[] args) {
		
		int[] ints = { 1, 2, 3, 4, 5 };
		for(int i : ints) {
			System.out.println("i is " + i);
		}
		
		System.out.println("Hello World of Java");
		
		HelloWorldLibrary lib = new HelloWorldLibrary();
		lib.About();
		
		HelloWorldLibraryExtended libext = new HelloWorldLibraryExtended();
		libext.About();
		libext.AboutExtended();
		
	
	
	
	HelloWorldLibrary libext2 = new HelloWorldLibraryExtended();
	
	libext2.About();
	
	}
	

}
