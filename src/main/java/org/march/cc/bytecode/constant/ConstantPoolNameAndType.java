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
public class ConstantPoolNameAndType extends ConstantPool {

	private short nameIndex;
	private short descriptorIndex;

	public void write(DataOutputStream dataOutputStream) {
		super.writeTag(CONSTANT_NameAndType_info, dataOutputStream);

		try {
			dataOutputStream.writeShort(nameIndex);
			dataOutputStream.writeShort(descriptorIndex);
		} catch (IOException e) {
			e.printStackTrace();
		}

	};
}
