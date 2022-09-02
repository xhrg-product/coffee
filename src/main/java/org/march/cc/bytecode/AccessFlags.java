package org.march.cc.bytecode;

/**
 * @ClassName: AccessFlags
 * @Description: TODO(类，属性，方法，访问控制符)
 * @author wang
 * @date 2018年1月2日
 */
public class AccessFlags {

	public static final short CLASS_ACC_PUBLIC = 0x0001;
	public static final short CLASS_ACC_FINAL = 0x0010;
	public static final short CLASS_ACC_SUPER = 0x0020;
	public static final short CLASS_ACC_INTERFACE = 0x0200;
	public static final short CLASS_ACC_ABSTRACT = 0x0400;
	public static final short CLASS_ACC_SYNTHETIC = 0x1000;
	public static final short CLASS_ACC_ANNOTATION = 0x2000;
	public static final short CLASS_ACC_ENUM = 0x4000;
	// 属性访问
	public static final short FD_ACC_PUBLIC = 0x0001;
	public static final short FD_ACC_PRIVATE = 0x0002;
	public static final short FD_ACC_PROTECETD = 0x0004;
	public static final short FD_ACC_STATIC = 0x0008;
	public static final short FD_ACC_FINAL = 0x0010;
	public static final short FD_ACC_VOLATILE = 0x0040;
	public static final short FD_ACC_TRANSIENT = 0x0080;
	public static final short FD_ACC_SYNTHETIC = 0x1000;
	public static final short FD_ACC_ENUM = 0x4000;
	// 方法访问
	public static final short MD_ACC_PUBLIC = 0x0001;
	public static final short MD_ACC_PRIVATE = 0x0002;
	public static final short MD_ACC_PROTECETD = 0x0004;
	public static final short MD_ACC_STATIC = 0x0008;
	public static final short MD_ACC_FINAL = 0x0010;
	public static final short MD_ACC_SYNCHRONIZED = 0x0020;
	public static final short MD_ACC_BRIDGE = 0x0040;
	public static final short MD_ACC_VARARGS = 0x0080;
	public static final short MD_ACC_NATIVE = 0x0100;
	public static final short MD_ACC_ABSTRACT = 0x0400;
	public static final short MD_ACC_STRICTFP = 0x0800;
	public static final short MD_ACC_SYNTHETIC = 0x1000;
}
