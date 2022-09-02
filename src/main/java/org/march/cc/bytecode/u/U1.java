package org.march.cc.bytecode.u;

import java.io.DataOutputStream;
import java.io.IOException;

public class U1 {

	private byte i;

	public static U1 code(byte i) {
		return new U1(i);
	}

	private U1(byte i) {
		this.i = i;
	}

	public void write(DataOutputStream dataOutputStream) {
		try {
			dataOutputStream.writeByte(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
