package com.gexin.test.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestA {
	@Test
	public void a1() {
		System.out.println("test a1");
	}

	@Category(SlowTests.class)
	@Test
	public void a2() {
		System.out.println("test a2");
	}
}
