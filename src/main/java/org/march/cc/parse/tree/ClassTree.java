package org.march.cc.parse.tree;

import java.util.List;

public class ClassTree {

	private PackageTree packageTree;

	private List<FieldTree> listField;

	private List<FuncTree> listFunc;

	public PackageTree getPackageTree() {
		return packageTree;
	}

	public void setPackageTree(PackageTree packageTree) {
		this.packageTree = packageTree;
	}

	public List<FieldTree> getListField() {
		return listField;
	}

	public void setListField(List<FieldTree> listField) {
		this.listField = listField;
	}

	public List<FuncTree> getListFunc() {
		return listFunc;
	}

	public void setListFunc(List<FuncTree> listFunc) {
		this.listFunc = listFunc;
	}

}
