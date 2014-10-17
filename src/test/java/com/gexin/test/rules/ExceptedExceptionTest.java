package com.gexin.test.rules;

import java.util.Collections;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptedExceptionTest {
	@Rule
	public ExpectedException exp = ExpectedException.none();

	@Test
	public void test1() {
		exp.expect(IndexOutOfBoundsException.class);
		Collections.emptyList().get(0);
	}

	@Test
	public void test2() {
		exp.expectMessage("Index: 0");
		Collections.emptyList().get(0);
	}

	@Test
	public void test3() {
		exp.expectCause(new BaseMatcher<Throwable>() {

			public boolean matches(Object item) {
				return item instanceof IndexOutOfBoundsException;
			}

			public void describeTo(Description description) {
				description.appendText("##Expected Cause Error##");
			}

		});

		try {
			Collections.emptyList().get(0);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
