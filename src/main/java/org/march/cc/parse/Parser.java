package org.march.cc.parse;

import java.util.List;

import org.march.cc.lexer.Lexer;
import org.march.cc.lexer.Scanner;
import org.march.cc.lexer.Token;
import org.march.cc.lexer.TokenType;
import org.march.cc.parse.tree.Tree;

public class Parser {

	private List<Token> listTokens;

	private int index = 0;

	public Parser(String filaPath) {
		this.listTokens = new Scanner(filaPath).getTokens();
	}

	public Parser(Lexer lexer) {
		this.listTokens = lexer.getTokens();
	}

	public Tree parse() {
		Token t = this.getNextToken();
		if (t.getTokenType() == TokenType.PACKAGE || t.getTokenType() == TokenType.IMPORT) {
			return parsecpt();
		}
		if (t.getTokenType() == TokenType.FUNC) {
			return parseFunc();
		}
		throw new RuntimeException(" parse error, go file is not start with package ,import or func");
	}

	private Tree parseFunc() {

		return null;
	}

	private Tree parsecpt() {
		
		return null;
	}

	public Token getNextToken() {
		return listTokens.get(index++);
	}
}
