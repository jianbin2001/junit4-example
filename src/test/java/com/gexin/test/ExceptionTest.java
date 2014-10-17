package com.gexin.test;

import java.util.Collections;

import org.junit.Test;

public class ExceptionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testException() {
		Collections.emptyList().get(0);
	}

}
