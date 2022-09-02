package org.march.cc.bytecode.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class ConstantPoolClass extends ConstantPool {

	private short index;

	@Override
	public void write(DataOutputStream outputStream) throws IOException {
		// 常量池写入tag
		outputStream.writeByte(CONSTANT_Class_info);
		outputStream.writeShort(index);
	}

}
