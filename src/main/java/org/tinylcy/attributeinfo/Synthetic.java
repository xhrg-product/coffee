package org.tinylcy.attributeinfo;

import org.tinylcy.basictype.U2;
import org.tinylcy.basictype.U4;
import org.tinylcy.constantpool.ConstantPool;
import org.tinylcy.constantpool.ConstantUtf8Info;

import java.io.InputStream;

/**
 * Created by chenyangli.
 */
public class Synthetic extends BasicAttributeInfo {

    public Synthetic(ConstantPool constantPool, short attributeNameIndex) {
        super(constantPool);
        setAttributeNameIndex(attributeNameIndex);
    }

    @Override
    public void read(InputStream inputStream) {
        U2 attributeNameIndexU2 = U2.read(inputStream);
        U4 attributeLengthU4 = U4.read(inputStream);
        setAttributeNameIndex(attributeNameIndexU2.getValue());
        setAttributeLength(attributeLengthU4.getValue());
    }

    @Override
    public String toString() {
        return "Synthetic{" +
                "attributeNameIndex=" + getAttributeNameIndex() +
                " [attribute name = " + ((ConstantUtf8Info) (constantPool.getCpInfo()[getAttributeNameIndex() - 1])).getValue() + "]" +
                ", attributeLength=" + getAttributeLength() +
                '}';
    }

}
