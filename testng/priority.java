package com.testng;

import org.testng.annotations.Test;

public class priority {

	@Test(priority = 3)
	private void sangeeth() {

		System.out.println("method 1");

	}

	@Test(priority = 1)
	private void priyan() {

		System.out.println("method 2");

	}

	@Test(priority = 2)
	private void rithin() {

		System.out.println("method 3");
		
		

	}
	@Test(priority = 4)
	private void rithinS() {

		System.out.println("method 3");
		
		

	}
}
