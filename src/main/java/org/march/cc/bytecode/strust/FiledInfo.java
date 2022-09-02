package org.march.cc.bytecode.strust;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

import org.march.cc.bytecode.attr.AttributeInfo;

public class FiledInfo {
	private short accessFlags;
	private short nameIndex;
	private short descriptorIndex;
	private short attributesCount;
	private List<AttributeInfo> attributeInfos;

	public void write(DataOutputStream dataOutputStream) throws IOException {
		dataOutputStream.writeShort(accessFlags);
		dataOutputStream.writeByte(nameIndex);
		dataOutputStream.writeByte(descriptorIndex);
		dataOutputStream.writeByte(attributesCount);
		for (AttributeInfo info : attributeInfos) {
			info.write(dataOutputStream);
		}
	}

	public short getAccessFlags() {
		return accessFlags;
	}

	public void setAccessFlags(short accessFlags) {
		this.accessFlags = accessFlags;
	}

	public short getNameIndex() {
		return nameIndex;
	}

	public void setNameIndex(short nameIndex) {
		this.nameIndex = nameIndex;
	}

	public short getDescriptorIndex() {
		return descriptorIndex;
	}

	public void setDescriptorIndex(short descriptorIndex) {
		this.descriptorIndex = descriptorIndex;
	}

	public short getAttributesCount() {
		return attributesCount;
	}

	public void setAttributesCount(short attributesCount) {
		this.attributesCount = attributesCount;
	}

	public List<AttributeInfo> getAttributeInfos() {
		return attributeInfos;
	}

	public void setAttributeInfos(List<AttributeInfo> attributeInfos) {
		this.attributeInfos = attributeInfos;
	}

}
