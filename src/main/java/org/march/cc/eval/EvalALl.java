package org.march.cc.eval;

import org.march.cc.parse.tree.FileTree;
import org.march.cc.parse.tree.Tree;
import org.march.cc.parse.tree.TreeType;

public class EvalALl {
	public static Object eval(Tree t) {
		if (t.getType() != TreeType.FILE) {
			throw new RuntimeException(" eval error ");
		}
		return doEval(t);
	}

	private static Object doEval(Tree t) {
		FileTree ft = (FileTree) t;

		return null;
	};
}
