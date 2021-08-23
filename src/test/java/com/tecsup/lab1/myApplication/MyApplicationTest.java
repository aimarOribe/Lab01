package com.tecsup.lab1.myApplication;

import org.junit.Assert;

import org.junit.Test;


public class MyApplicationTest {
	
	@Test
	public void testApp() {
		MyApplication appObject = new MyApplication();
		Assert.assertEquals(appObject.reverseString("Hola!"), "!aloH");
	}


}
