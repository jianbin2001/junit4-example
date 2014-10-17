package com.gexin.test.rules;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestWatcherTest {
	@Rule
	public TestWatcher watcher = new TestWatcher() {

		@Override
		protected void succeeded(Description description) {
			System.out.println("test " + description.getMethodName() + " succeed");
		}

		@Override
		protected void failed(Throwable e, Description description) {
			System.out.println("test " + description.getMethodName() + " failed, " + e);
		}

		@Override
		protected void skipped(AssumptionViolatedException e, Description description) {
			System.out.println("test " + description.getMethodName() + " skipped");
		}

		@Override
		protected void starting(Description description) {
			System.out.println("test " + description.getMethodName() + " starting");
		}

		@Override
		protected void finished(Description description) {
			System.out.println("test " + description.getMethodName() + " finished");
		}

	};

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(1 == 3);
	}
}
