package org.march.cc.bytecode.constant;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @ClassName: ConstantPoolInfo
 * @Description: TODO(常连池超类)
 * @author faicm
 * @date 2018年5月25日
 * 
 */
public class ConstantPoolFieldRef extends ConstantPool {

	private short classIndex;
	private short nameAndTypeIndex;

	public void write(DataOutputStream dataOutputStream) {
		super.writeTag(CONSTANT_Fieldref_info, dataOutputStream);

		try {
			dataOutputStream.writeShort(classIndex);
			dataOutputStream.writeShort(nameAndTypeIndex);
		} catch (IOException e) {
			e.printStackTrace();
		}

	};
}
