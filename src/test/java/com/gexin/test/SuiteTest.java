package com.gexin.test;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExceptionTest.class, IgnoreTest.class, ParameterTest.class, TheoriesTest.class, TimeoutTest.class })
public class SuiteTest {

	@ClassRule
	public static ExternalResource resource = new ExternalResource() {

		@Override
		protected void before() throws Throwable {
			System.out.println("before test");
		}

		@Override
		protected void after() {
			System.out.println("after test");
		}

	};

}
