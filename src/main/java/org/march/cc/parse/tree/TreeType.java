package org.march.cc.parse.tree;

public enum TreeType {

	FILE, PACKAGE, FUNC, END, STATEMENT, EXPRESS;

}

/*
 * 一个file表示一个源码文件，一个源码文件可能包含多个类。
 * 
 */