package org.march.cc.bytecode.attr;

import java.io.DataOutputStream;
import java.io.IOException;

public class AttrException extends AttributeInfo {

	@Override
	public void write(DataOutputStream dataOutputStream) throws IOException {

	}

	private short NumberOfException;

	private short[] exceptionIndexTable;

	public short getNumberOfException() {
		return NumberOfException;
	}

	public void setNumberOfException(short numberOfException) {
		NumberOfException = numberOfException;
	}

	public short[] getExceptionIndexTable() {
		return exceptionIndexTable;
	}

	public void setExceptionIndexTable(short[] exceptionIndexTable) {
		this.exceptionIndexTable = exceptionIndexTable;
	}
}
