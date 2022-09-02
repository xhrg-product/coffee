package org.march.cc.bytecode.constant;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ConstantPoolInfo
 * @Description: TODO(常连池超类)
 * @author faicm
 * @date 2018年5月25日
 * 
 */
public abstract class ConstantPool {

	public static byte CONSTANT_Utf8_info = 1;

	public static byte CONSTANT_Integer_info = 3;

	public static byte CONSTANT_Float_info = 4;

	public static byte CONSTANT_Long_info = 5;

	public static byte CONSTANT_Double_info = 6;

	public static byte CONSTANT_Class_info = 7;

	public static byte CONSTANT_String_info = 8;

	public static byte CONSTANT_Fieldref_info = 9;

	public static byte CONSTANT_Methodref_info = 10;

	public static byte CONSTANT_InterfaceMethodref_info = 11;

	public static byte CONSTANT_NameAndType_info = 12;

	/**
	 * 索引
	 */
	private int index;

	// 常量池，key表示utf-8字符串，value表示索引。
	public static Map<?, ConstantPool> map = new HashMap<>();

	public abstract void write(DataOutputStream dataOutputStream) throws IOException;

	public void writeTag(byte tag, DataOutputStream dataOutputStream) {
		try {
			dataOutputStream.writeByte(tag);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
