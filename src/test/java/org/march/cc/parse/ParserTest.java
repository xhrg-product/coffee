package org.march.cc.parse;

import org.march.cc.common.Constant;
import org.march.cc.parse.tree.Tree;

import junit.framework.TestCase;

public class ParserTest extends TestCase {
	public void test() {
		String filePath = "C:\\Users\\" + Constant.USERNAME + "\\git\\march\\march-cc\\src\\test\\go\\main.go";
		Parser p = new Parser(filePath);
		Tree t = p.parse();
	}
}
