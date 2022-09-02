package org.march.cc.parse.tree;

import java.util.List;

public class PackageTree implements Tree {

	private String packagePath;

	private List<String> importList;

	private List<FuncTree> funcList;

	public TreeType getType() {
		return TreeType.PACKAGE;
	}

	public String getPackagePath() {
		return packagePath;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	public List<String> getImportList() {
		return importList;
	}

	public void setImportList(List<String> importList) {
		this.importList = importList;
	}

	public List<FuncTree> getFuncList() {
		return funcList;
	}

	public void setFuncList(List<FuncTree> funcList) {
		this.funcList = funcList;
	}
}
