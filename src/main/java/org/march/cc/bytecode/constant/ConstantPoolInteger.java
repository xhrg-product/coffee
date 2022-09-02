package org.march.cc.bytecode.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class ConstantPoolInteger extends ConstantPool {

	private int value;

	@Override
	public void write(DataOutputStream outputStream) throws IOException {
		// 常量池写入tag
		outputStream.writeByte(CONSTANT_Integer_info);
		outputStream.writeInt(value);
	}

}
