package org.march.cc.bytecode.constant;

import java.io.DataOutputStream;
import java.io.IOException;

public class ConstantPoolUtf8 extends ConstantPool {

	private String str;

	@Override
	public void write(DataOutputStream outputStream) throws IOException {
		// 常量池写入tag
		outputStream.writeByte(CONSTANT_Utf8_info);
		// 写入字符串，注意，这个方法有个特点，他会自动的先写字符串的字节长度，然后写字节。
		outputStream.writeUTF(str);
	}

}
