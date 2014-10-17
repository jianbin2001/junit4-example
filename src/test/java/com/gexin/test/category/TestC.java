package com.gexin.test.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({ SlowTests.class, FastTests.class })
public class TestC {
	@Test
	public void c() {
		System.out.println("test c1");
	}
}
