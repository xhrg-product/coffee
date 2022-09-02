package org.march.cc.lexer;

import java.util.List;

public interface Lexer {

	Token nextToken();

	List<Token> getTokens();

}
