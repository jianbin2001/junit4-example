package com.gexin.test;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

// 声明理论测试运行器
@RunWith(Theories.class)
public class TheoriesTest {
	private static int times = 0;

	// 告诉框架，标注的这些数据都是准备用来测试的数据
	@DataPoint 
	public static int a = 1;
	@DataPoint
	public static int b = 5;
	@DataPoint
	public static int c = 10;

	// 标注的方法，是需要进行理论测试的方法(使用@Theory注解，不用@Test)
	@Theory
	public void testMethod(int x, int y) {
		System.out.println("test " + (++times) + ", input: x=" + x + ", y=" + y);
		Assert.assertTrue("should large than 0", x + y > 0);
	}
}
