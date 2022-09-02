package org.march.cc.sem;

import java.util.HashMap;
import java.util.Map;

public class Scope {

	private Scope parent;

	private Map<String, Symbol> map = new HashMap<>();

	public void put(Symbol symbol) {

		String name = symbol.getName();

		if (map.containsKey(name)) {// {int a=1;int a=2;}
			throw new RuntimeException(" Repeated declare " + name);
		}

		symbol.setScope(this);

		map.put(name, symbol);
	}

	public Symbol find(String name) {
		Symbol s = map.get(name);
		if (s != null) {
			return s;
		}
		if (parent == null) {
			return null;
		}
		return parent.find(name);
	}

}
