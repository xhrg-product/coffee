package org.march.cc.bytecode;

import java.io.DataOutputStream;

import org.march.cc.bytecode.attr.AttributeInfo;
import org.march.cc.bytecode.constant.ConstantPool;
import org.march.cc.bytecode.strust.FiledInfo;
import org.march.cc.bytecode.strust.InterfaceInfo;
import org.march.cc.bytecode.strust.MethodInfo;
import org.march.cc.bytecode.u.U2;
import org.march.cc.bytecode.u.U4;

public class ClassFile {

	private U4 magic;
	private U2 majorVersion;
	private U2 minorVersion;
	private U2 constantPoolCount;// N+1
	private ConstantPool[] constantPool;
	private U2 accessFlags;
	// 常量池索引指向class
	private U2 thisClass;
	// 常量池索引指向class
	private U2 superClass;
	// 接口数量
	private U2 interfacesCount;
	// 接口信息
	private InterfaceInfo[] interfaceInfo;

	private FiledInfo[] fileds;

	private U2 methodCount;

	private MethodInfo[] methods;

	private U2 attributesCount;

	private AttributeInfo[] attributes;

	public void write(DataOutputStream dataOutputStream) {

	}

	public U4 getMagic() {
		return magic;
	}

	public void setMagic(U4 magic) {
		this.magic = magic;
	}

	public U2 getMinorVersion() {
		return minorVersion;
	}

	public void setMinorVersion(U2 minorVersion) {
		this.minorVersion = minorVersion;
	}

	public U2 getMajorVersion() {
		return majorVersion;
	}

	public void setMajorVersion(U2 majorVersion) {
		this.majorVersion = majorVersion;
	}

	public U2 getConstantPoolCount() {
		return constantPoolCount;
	}

	public void setConstantPoolCount(U2 constantPoolCount) {
		this.constantPoolCount = constantPoolCount;
	}

	public ConstantPool[] getConstantPool() {
		return constantPool;
	}

	public void setConstantPool(ConstantPool[] constantPool) {
		this.constantPool = constantPool;
	}

	public U2 getAccessFlags() {
		return accessFlags;
	}

	public void setAccessFlags(U2 accessFlags) {
		this.accessFlags = accessFlags;
	}

	public U2 getThisClass() {
		return thisClass;
	}

	public void setThisClass(U2 thisClass) {
		this.thisClass = thisClass;
	}

	public U2 getSuperClass() {
		return superClass;
	}

	public void setSuperClass(U2 superClass) {
		this.superClass = superClass;
	}

	public FiledInfo[] getFileds() {
		return fileds;
	}

	public void setFileds(FiledInfo[] fileds) {
		this.fileds = fileds;
	}

	public U2 getMethodCount() {
		return methodCount;
	}

	public void setMethodCount(U2 methodCount) {
		this.methodCount = methodCount;
	}

	public MethodInfo[] getMethods() {
		return methods;
	}

	public void setMethods(MethodInfo[] methods) {
		this.methods = methods;
	}

	public U2 getAttributesCount() {
		return attributesCount;
	}

	public void setAttributesCount(U2 attributesCount) {
		this.attributesCount = attributesCount;
	}

	public AttributeInfo[] getAttributes() {
		return attributes;
	}

	public void setAttributes(AttributeInfo[] attributes) {
		this.attributes = attributes;
	}

	public U2 getInterfacesCount() {
		return interfacesCount;
	}

	public void setInterfacesCount(U2 interfacesCount) {
		this.interfacesCount = interfacesCount;
	}

	public InterfaceInfo[] getInterfaceInfo() {
		return interfaceInfo;
	}

	public void setInterfaceInfo(InterfaceInfo[] interfaceInfo) {
		this.interfaceInfo = interfaceInfo;
	}
}
