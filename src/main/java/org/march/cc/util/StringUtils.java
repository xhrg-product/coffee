package org.march.cc.util;

public abstract class StringUtils {

	public static boolean isEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}
