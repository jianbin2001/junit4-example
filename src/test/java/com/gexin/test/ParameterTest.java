package com.gexin.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// 声明所参数化运行器
@RunWith(Parameterized.class)
public class ParameterTest {

	private int a;
	private int b;
	private int expect;

	public ParameterTest(int a, int b, int expect) {
		this.a = a;
		this.b = b;
		this.expect = expect;
	}

	@Parameters(name = "the {index} test, input:{0} and {1}, expect: {2}")
	public static Iterable<Object[]> params() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { 1, 1, 2 }, { -1, 1, 1 } });
	};

	@Test
	public void testAdd() {
		System.out.println("a=" + a + ", b=" + b + ", expect=" + expect);
		Assert.assertEquals(expect, a + b);
	}
}
