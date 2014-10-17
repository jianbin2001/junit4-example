package com.gexin.test.rules;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameTest {
	@Rule
	public TestName name = new TestName();

	@Test
	public void testXXX() {
		System.out.println("test method: " + name.getMethodName());
		Assert.assertEquals("testXXX", name.getMethodName());
	}
}
