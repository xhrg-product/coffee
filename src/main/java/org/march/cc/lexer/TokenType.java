package org.march.cc.lexer;

import java.util.HashMap;
import java.util.Map;

/*

package main  
  
import "fmt"  
  
func main() {  
    fmt.Printf("Hello, world.\n")  
} 


token 有严格限定，只有单一的token才有val值，比如  while if 这样的token  、标示符，数字等token都是空字符串

*/
public enum TokenType {
    // String char int float double long byte keyword(比如class void) { } | ;
    // ++ + - -- * / += -= *= /=
    // 固定类类型
    EOF(""), PACKAGE("package"), IMPORT("import"), FUNC("func"), IDENTIFIER(""), PLUS("+"), PLUSPLUS("++"), SUB("-"), SUBSUB("--"), STAR("*"), SLASH("/"), EQ(
            "="),

    FLOAT(""), INT(""), LFS("("), RIS(")"), LFB("{"), RIB("}"), SEM(";"), POINT("."),
    // 控制流
    IF("if"), WHILE("while"),
    // 不固定类型
    STRING("");

    private String val;

    TokenType(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    private static Map<String, TokenType> map = new HashMap<>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType t : tokenTypes) {
            map.put(t.val, t);
        }
    }

    public static TokenType getSingleToken(String str) {
        return map.get(str);
    }

}
