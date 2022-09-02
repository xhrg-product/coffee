package org.march.cc.bytecode;

import org.march.cc.bytecode.u.U2;
import org.march.cc.bytecode.u.U4;

public class ClassConstant {

	public static U4 magic = U4.code(0xCAFEBABE);

	public static final int JAVA_6 = 50;

	/**
	 * The major version number of class files for JDK 1.7.
	 */
	public static final int JAVA_7 = 51;

	public static U2 majorVersion = U2.code((byte) JAVA_7);

	// minor = 0; // JDK 1.3 or later
	public static U2 minorVersion = U2.code((byte) 0);

}
