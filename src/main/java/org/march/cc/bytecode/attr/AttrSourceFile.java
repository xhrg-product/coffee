package org.march.cc.bytecode.attr;

import java.io.DataOutputStream;
import java.io.IOException;

public class AttrSourceFile extends AttributeInfo {

	public static final String tag = "SourceFile";

	private short nameIndex;
	private int attributeLength;
	private short sourceFileIndex;

	public short getNameIndex() {
		return nameIndex;
	}

	public void setNameIndex(short nameIndex) {
		this.nameIndex = nameIndex;
	}

	public int getAttributeLength() {
		return attributeLength;
	}

	public void setAttributeLength(int attributeLength) {
		this.attributeLength = attributeLength;
	}

	public short getSourceFileIndex() {
		return sourceFileIndex;
	}

	public void setSourceFileIndex(short sourceFileIndex) {
		this.sourceFileIndex = sourceFileIndex;
	}

	@Override
	public void write(DataOutputStream dataOutputStream) throws IOException {
		dataOutputStream.writeShort(nameIndex);
		dataOutputStream.writeInt(attributeLength);
		dataOutputStream.writeShort(sourceFileIndex);
	}
}
