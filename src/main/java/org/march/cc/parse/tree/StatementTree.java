package org.march.cc.parse.tree;

public class StatementTree implements Tree {

	@Override
	public TreeType getType() {
		return TreeType.STATEMENT;
	}

}
