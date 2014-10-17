package com.gexin.test.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
	@Rule
	public Timeout timeout = new Timeout(3000);

	@Test
	public void test1() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}

	@Test(timeout = 5000)
	public void test2() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}

	@Test(timeout = 2000)
	public void test3() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}
}
