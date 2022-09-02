package org.march.cc.bytecode.attr;

import java.io.DataOutputStream;
import java.io.IOException;

public class AttrConstantValue extends AttributeInfo {

	@Override
	public void write(DataOutputStream dataOutputStream) throws IOException {

	}

	private static String tag = "ConstantValue";

	private short constantValueIndex;

	public short getConstantValueIndex() {
		return constantValueIndex;
	}

	public void setConstantValueIndex(short constantValueIndex) {
		this.constantValueIndex = constantValueIndex;
	}

}
