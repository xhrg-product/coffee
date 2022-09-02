package org.tinylcy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by chenyangli.
 */
public class ClassFileTest {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/path/to/TestClass.class");
		FileInputStream inputStream = new FileInputStream(file);
		ClassReader.analyze(inputStream);
	}

}
