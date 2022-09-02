package org.march.cc.bytecode.strust;

import java.io.DataOutputStream;
import java.io.IOException;

public class InterfaceInfo {

	public byte index;

	// 只想常量池中class的索引
	public void write(DataOutputStream dataOutputStream) {
		try {
			dataOutputStream.writeShort(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
