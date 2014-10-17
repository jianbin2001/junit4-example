package com.gexin.test;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest {

	private int ver = 2;

	@Test
	public void test1() {
		Assume.assumeTrue(ver < 2);
		System.out.println("test1");
	}

	@Test
	public void test2() {
		Assume.assumeTrue(ver >= 2);
		System.out.println("test2");
	}

}
