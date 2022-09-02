package org.march.cc.bytecode.attr;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class AttributeInfo {

	// 指的是tag的length
	private short attributeNameIndex;

	private int attributeLength;

	private byte info;

	public abstract void write(DataOutputStream dataOutputStream) throws IOException;
}
