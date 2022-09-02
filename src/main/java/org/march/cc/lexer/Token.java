package org.march.cc.lexer;

public class Token {
	public Token() {
	}

	public Token(TokenType tokenType) {
		this(tokenType, "");
	}

	public Token(TokenType tokenType, String value) {
		this.tokenType = tokenType;
		this.value = value;
	}

	private TokenType tokenType;

	private String value;

	public TokenType getTokenType() {
		return tokenType;
	}

	public void setTokenType(TokenType tokenType) {
		this.tokenType = tokenType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String str = value;
		if (str.isEmpty()) {
			str = tokenType.getVal();
		}
		return "token  " + str + "\t\t,tokenType:" + tokenType + " ; ";
	}
}
