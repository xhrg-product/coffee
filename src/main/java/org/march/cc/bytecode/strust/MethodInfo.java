package org.march.cc.bytecode.strust;

import java.util.List;

import org.march.cc.bytecode.attr.AttributeInfo;
import org.march.cc.bytecode.u.U2;

/**
 * @ClassName: MethodInfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author faicm
 * @date 2018年5月29日
 * 
 */
public class MethodInfo {
	private U2 accessFlags;
	private U2 nameIndex;
	private U2 descriptorIndex;
	private U2 attributesCount;
	private List<AttributeInfo> attributeInfos;

	public U2 getAccessFlags() {
		return accessFlags;
	}

	public void setAccessFlags(U2 accessFlags) {
		this.accessFlags = accessFlags;
	}

	public U2 getNameIndex() {
		return nameIndex;
	}

	public void setNameIndex(U2 nameIndex) {
		this.nameIndex = nameIndex;
	}

	public U2 getDescriptorIndex() {
		return descriptorIndex;
	}

	public void setDescriptorIndex(U2 descriptorIndex) {
		this.descriptorIndex = descriptorIndex;
	}

	public U2 getAttributesCount() {
		return attributesCount;
	}

	public void setAttributesCount(U2 attributesCount) {
		this.attributesCount = attributesCount;
	}

	public List<AttributeInfo> getAttributeInfos() {
		return attributeInfos;
	}

	public void setAttributeInfos(List<AttributeInfo> attributeInfos) {
		this.attributeInfos = attributeInfos;
	}

}
