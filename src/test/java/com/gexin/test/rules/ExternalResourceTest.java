package com.gexin.test.rules;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ExternalResourceTest {
	@Rule
	public ExternalResource resource = new ExternalResource() {

		@Override
		protected void before() throws Throwable {
			System.out.println("resource before");
		}

		@Override
		protected void after() {
			System.out.println("resource after");
		}

	};

	@BeforeClass
	public static void beforeClass() {
		System.out.println("class before");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("class after");
	}

	@Before
	public void beforeMethod() {
		System.out.println("method before");
	}

	@After
	public void afterMethod() {
		System.out.println("method after");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
