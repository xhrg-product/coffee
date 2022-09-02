package org.march.cc.eval;

/**
 * 
 * 语法树需要实现该接口，使得直接遍历语法树执行代码
 * 
 * @author faicm
 *
 */
public interface TreeEval {
	public Object eval(Object... para);
}
