package com.gexin.test.rules;

import org.junit.After;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifyTest {

	@Rule
	public Verifier verifier = new Verifier() {
		@Override
		protected void verify() throws Throwable {
			System.out.println("verify");
		}
	};

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(1 == 3);
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}

	@After
	public void after() {
		System.out.println("after test");
	}

}
