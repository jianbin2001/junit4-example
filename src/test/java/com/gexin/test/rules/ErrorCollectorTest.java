package com.gexin.test.rules;

import java.util.Collections;
import java.util.concurrent.Callable;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorTest {

	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

	@Test
	public void testCheckThat() {
		int i = 0;
		int[] array = new int[] { 0, 3, 4, 6, 7 };
		for (int num : array) {
			errorCollector.checkThat("test for " + i, num, CoreMatchers.is(i + i));
			i++;
		}
	}

	@Test
	public void testCheckSucceed() {
		errorCollector.checkSucceeds(new Callable<Object>() {

			public Object call() throws Exception {
				Assert.assertThat(5, CoreMatchers.is(2 * 2));
				Assert.assertThat(6, CoreMatchers.is(2 * 3));
				Assert.assertThat(8, CoreMatchers.is(2 * 4));
				Assert.assertThat(9, CoreMatchers.is(2 * 5));
				return null;
			}
		});
	}

	@Test
	public void testAddError() {
		try {
			Collections.emptyList().get(0);
		} catch (Exception e) {
			errorCollector.addError(e);
		}
		
		try {
			Class.forName("aaaaa");
		} catch (Exception e) {
			errorCollector.addError(e);
		}
	}
}
