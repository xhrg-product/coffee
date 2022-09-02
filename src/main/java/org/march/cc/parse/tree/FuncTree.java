package org.march.cc.parse.tree;

import java.util.List;

public class FuncTree implements Tree {

	private String funcName;

	private List<StatementTree> list;

	@Override
	public TreeType getType() {
		return TreeType.FUNC;
	}

	public List<StatementTree> getList() {
		return list;
	}

	public void setList(List<StatementTree> list) {
		this.list = list;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
}
