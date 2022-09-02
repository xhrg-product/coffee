package org.march.cc.parse.tree;

public class FileTree implements Tree {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public TreeType getType() {
		return TreeType.FILE;
	}
}
