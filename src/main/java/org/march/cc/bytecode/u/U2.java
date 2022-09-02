package org.march.cc.bytecode.u;

import java.io.DataOutputStream;
import java.io.IOException;

public class U2 {

	private short i;

	public static U2 code(short i) {
		return new U2(i);
	}

	private U2(short i) {
		this.i = i;
	}

	public void write(DataOutputStream dataOutputStream) {
		try {
			dataOutputStream.writeShort(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
