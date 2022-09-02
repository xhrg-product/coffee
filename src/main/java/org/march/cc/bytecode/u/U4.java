package org.march.cc.bytecode.u;

import java.io.DataOutputStream;
import java.io.IOException;

public class U4 {
	private int i;

	public static U4 code(int i) {
		return new U4(i);
	}

	private U4(int i) {
		this.i = i;
	}

	public void write(DataOutputStream dataOutputStream) {
		try {
			dataOutputStream.writeInt(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
