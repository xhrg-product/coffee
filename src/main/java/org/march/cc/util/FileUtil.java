package org.march.cc.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {

	public static String fileToStr(String path) {
		try {
			List<String> list = Files.readAllLines(Paths.get(path));
			StringBuilder sb = new StringBuilder();
			for (String str : list) {
				sb.append(str).append('\n');
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	};
}
