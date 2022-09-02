package org.march.cc.parse.tree;

import java.util.List;

public class IfTree extends StatementTree {

	private ExpressTree condtion;

	private List<StatementTree> listStatement;

	public ExpressTree getCondtion() {
		return condtion;
	}

	public void setCondtion(ExpressTree condtion) {
		this.condtion = condtion;
	}

	public List<StatementTree> getListStatement() {
		return listStatement;
	}

	public void setListStatement(List<StatementTree> listStatement) {
		this.listStatement = listStatement;
	}

}
