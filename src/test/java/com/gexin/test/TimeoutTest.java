package com.gexin.test;

import org.junit.Test;

public class TimeoutTest {

	@Test(timeout = 2000) // 单位：ms
	public void testTimeout() {
		while (true) { // 长时间测试未结束
		}
	}

}
