package com.gexin.test.rules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderTest {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		File newFile = folder.newFile("test.txt");
		FileOutputStream fos = new FileOutputStream(newFile);

		byte[] bytes = new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fos.write(bytes, 0, bytes.length);
		fos.close();

		FileInputStream fis = new FileInputStream(newFile);
		byte[] read = new byte[bytes.length];
		fis.read(read, 0, read.length);
		fis.close();
		Assert.assertArrayEquals(bytes, read);
	}
}
