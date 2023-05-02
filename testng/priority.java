package com.testng;

import org.testng.annotations.Test;

public class priority {

	@Test(priority = 3)
	private void sangeeth() {
System.out.println("method one");
	} 
	
	@Test(priority = 1)
	private void priyan() {
	System.out.println("method Two");
	}


	@Test(priority = 2)
	private void Sanjay() {

		System.out.println("method Three");
		}
	
	@Test(priority = 4)
	private void rithinS() {		
	System.out.println("method Four");


	}
}
