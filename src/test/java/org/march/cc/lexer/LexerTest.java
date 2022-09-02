package org.march.cc.lexer;

import java.net.UnknownHostException;
import java.util.List;

import org.march.cc.common.Constant;

import junit.framework.TestCase;

/**
 * @ClassName: LexerTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author faicm
 * @date 2017年7月3日 下午9:56:28
 * 
 */
public class LexerTest extends TestCase {

	public void testApp() throws UnknownHostException {
		String filePath = "C:\\Users\\" + Constant.USERNAME + "\\git\\march\\march-cc\\src\\test\\go\\main.go";
		//System.out.println(filePath);
		Lexer lexer = new Scanner(filePath);
		List<Token> tks = lexer.getTokens();
		for (Token t : tks) {
			System.out.println(t);
		}
	}
}
