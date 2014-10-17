package com.gexin.test;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

	@Test
	@Ignore("暂时还没准备好，暂时不测试")
	public void testIgnore() {
		assertTrue(false);
	}

}
