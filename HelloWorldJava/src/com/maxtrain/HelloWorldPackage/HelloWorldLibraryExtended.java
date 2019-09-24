package com.maxtrain.HelloWorldPackage;

public class HelloWorldLibraryExtended extends HelloWorldLibrary {
	
	public void AboutExtended() {
		System.out.println("About HelloWorldLibraryExtended");
	}
	@Override
	public void About() {
		AboutExtended();
	}
}
