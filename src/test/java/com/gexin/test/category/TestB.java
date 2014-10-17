package com.gexin.test.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestB {
	@Category(FastTests.class)
	@Test
	public void b() {
		System.out.println("test b1");
	}
}
