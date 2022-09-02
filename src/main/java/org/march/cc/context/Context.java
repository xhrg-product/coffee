package org.march.cc.context;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Context
 * @Description: TODO(上下文)
 * @author faicm
 * @date 2017年7月2日 下午6:52:45
 * 
 */
public class Context {
	private Map<Class<?>, Object> map = new HashMap<>();

	public Object get(Class<?> clazz) {
		return map.get(clazz);
	}

	public void put(Class<?> clazz, Object obj) {
		map.put(clazz, obj);
	}
}
