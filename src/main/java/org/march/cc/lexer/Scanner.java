package org.march.cc.lexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.march.cc.exception.LexerException;
import org.march.cc.util.FileUtil;
import org.march.cc.util.StringUtils;

/**
 * @ClassName: Scanner
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author faicm
 * @date 2017年7月3日 下午9:59:07
 * 
 * 
 *       token 分为2类，一种是固定形式的token,比如 for,while,if等token 另一种是非固定形式的token，比如
 *       Person ppp; 这里的Person 和 ppp都是固定形式的。
 */
public class Scanner implements Lexer {

	private String str;

	private int index;

	public Scanner(String str) {
		this.str = FileUtil.fileToStr(str);
		index = 0;
	}

	@Override
	public Token nextToken() {

		if (this.isEnd()) {
			return new Token(TokenType.EOF);
		}

		char c = this.nextChar();
		if (c == '/') {
			skipNote();
			return nextToken();
		}

		if ('0' <= c && c <= '9') {
			return numberToken();
		}

		if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
			return idenToken();
		}
		if (c == '"') {
			return strToken();
		}

		return operaToken();
	}

	private Token strToken() {
		char c = ' ';
		StringBuilder sb = new StringBuilder();
		while ((c = this.nextChar()) != '"') {
			sb.append(c);
		}
		return new Token(TokenType.STRING, sb.toString());
	}

	private boolean isOperaChar(char c) {
		return !(isidchar(c) || isSkip(c));
	}

	private Token operaToken() {
		char c = this.currChar();
		if (isidchar(c)) {
			throw new RuntimeException("operaToken");
		}
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		TokenType t = TokenType.getSingleToken(sb.toString());
		while (isOperaChar((c = this.nextChar()))) {
			sb.append(c);
			TokenType t1 = TokenType.getSingleToken(sb.toString());
			if (t1 != null) {
				t = t1;
			}
		}
		TokenType t1 = TokenType.getSingleToken(sb.toString());
		if (t1 != null) {
			t = t1;
		}
		if (t == null) {
			throw new RuntimeException("operaToken ,no symble " + sb);
		}

		index = index - (sb.length() - t.getVal().length() + 1);
		return new Token(t);
	}

	private void skipNote() {
		char c = this.currChar();
		char c1 = this.nextChar();
		if (c == '/' && c1 == '/') {
			while (((c = this.nextChar()) != '\n')) {
			}
			return;
		}
		if (c == '/' && c1 == '*') {
			while (true) {
				c = this.currChar();
				c1 = this.nextChar();
				if (c == '*' && c1 == '/') {
					break;
				}
			}
			return;
		}
		throw new RuntimeException(" 错误的 / 符号 ");
	}

	private boolean isSkip(char c) {
		return c == ' ' || c == '\t' || c == '\n' || c == '\t';
	}

	/**
	 * @Title: skip @Description: TODO(这里用一句话描述这个方法的作用) @param 设定文件 @return void
	 *         返回类型 @throws
	 */
	private void skip() {
		while (true) {
			if (index < str.length()) {
				char c = this.nextChar();
				if (c == ' ' || c == '\n' || c == '\t') {
				} else {
					index--;
					return;
				}
			} else {
				return;
			}

		}

	}

	private Token idenToken() {
		char c = this.currChar();
		if (!isidchar(c)) {
			throw new RuntimeException(" 字符传匹配必须是字幕美元符开头");
		}
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		for (;;) {
			c = this.nextChar();
			if (isidchar(c) || isNumber(c)) {
				sb.append(c);
			} else {
				break;
			}
		}
		index--;
		TokenType t = TokenType.getSingleToken(sb.toString());
		if (t != null) {
			return new Token(t);
		}
		return new Token(TokenType.IDENTIFIER, sb.toString());
	}

	private boolean isEnd() {
		if (index >= str.length()) {
			return true;
		}
		skip();
		return index >= str.length();
	}

	// 是否是标示符 ，字母数字，美元符号
	private boolean isidchar(char c) {
		if ('0' <= c && c <= '9') {
			return true;
		}
		if ('a' <= c && c <= 'z') {
			return true;
		}
		if ('A' <= c && c <= 'Z') {
			return true;
		}
		if (c == '$' || c == '_') {
			return true;
		}
		return false;
	}

	private Token numberToken() {
		StringBuilder sb = new StringBuilder();
		char c = currChar();
		// 数字token的第一位不能是非数字或0。
		if (!isNumber(c) || c == '0') {
			throw new LexerException(" numberToken exception ");
		}
		sb.append(c);
		int numSpot = 0;
		for (;;) {
			c = nextChar();
			if (!(isNumber(c) || c == '.')) {
				index--;
				break;
			}
			sb.append(c);
			if (c == '.') {
				numSpot++;
			}
			// 有"."表示浮点数。无"."表示整型。
			if (numSpot >= 2) {
				throw new LexerException(" numberToken exception,Number error ");
			}

		}
		Token t = new Token();
		t.setValue(sb.toString());
		if (numSpot == 0) {
			t.setTokenType(TokenType.INT);
		} else {
			t.setTokenType(TokenType.FLOAT);
		}
		return t;
	}

	@Override
	public List<Token> getTokens() {
		if (StringUtils.isEmpty(str)) {
			return Collections.emptyList();
		}
		List<Token> list = new ArrayList<>();
		while (!this.isEnd()) {
			Token t = this.nextToken();
			list.add(t);
			if (t.getTokenType() == TokenType.RIB) {
				System.out.println("debug");
			}
		}
		return list;
	}

	private char currChar() {
		return str.charAt(index - 1);
	}

	private char nextChar() {
		return str.charAt(index++);
	}

	private boolean isNumber(char c) {
		return '0' <= c && c <= '9';
	}

}
