package org.march.cc.bytecode.attr;

import java.io.DataOutputStream;

import org.march.cc.bytecode.ExceptionTable;
import org.march.cc.bytecode.u.U1;
import org.march.cc.bytecode.u.U2;
import org.march.cc.bytecode.u.U4;

public class AttrCode extends AttributeInfo {

	public static final String tag = "Code";

	private U2 attributeNameIndex;
	private U4 attributeLength;
	private U2 maxStack;
	private U2 maxLocal;
	private U4 codeLength;
	private U1 code;
	private U2 exceptionTableLength;
	private ExceptionTable ex;
	private U2 attributeInfo;
	private AttributeInfo a;

	@Override
	public void write(DataOutputStream dataOutputStream) {
	}

	public U2 getAttributeNameIndex() {
		return attributeNameIndex;
	}

	public void setAttributeNameIndex(U2 attributeNameIndex) {
		this.attributeNameIndex = attributeNameIndex;
	}

	public U4 getAttributeLength() {
		return attributeLength;
	}

	public void setAttributeLength(U4 attributeLength) {
		this.attributeLength = attributeLength;
	}

	public U2 getMaxStack() {
		return maxStack;
	}

	public void setMaxStack(U2 maxStack) {
		this.maxStack = maxStack;
	}

	public U2 getMaxLocal() {
		return maxLocal;
	}

	public void setMaxLocal(U2 maxLocal) {
		this.maxLocal = maxLocal;
	}

	public U4 getCodeLength() {
		return codeLength;
	}

	public void setCodeLength(U4 codeLength) {
		this.codeLength = codeLength;
	}

	public U1 getCode() {
		return code;
	}

	public void setCode(U1 code) {
		this.code = code;
	}

	public U2 getExceptionTableLength() {
		return exceptionTableLength;
	}

	public void setExceptionTableLength(U2 exceptionTableLength) {
		this.exceptionTableLength = exceptionTableLength;
	}

	public ExceptionTable getEx() {
		return ex;
	}

	public void setEx(ExceptionTable ex) {
		this.ex = ex;
	}

	public U2 getAttributeInfo() {
		return attributeInfo;
	}

	public void setAttributeInfo(U2 attributeInfo) {
		this.attributeInfo = attributeInfo;
	}

	public AttributeInfo getA() {
		return a;
	}

	public void setA(AttributeInfo a) {
		this.a = a;
	}

	public static String getTag() {
		return tag;
	}
}
