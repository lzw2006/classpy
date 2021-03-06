package com.github.zxh.classpy.classfile.attribute;

import com.github.zxh.classpy.classfile.reader.ClassReader;
import com.github.zxh.classpy.classfile.datatype.U2CpIndex;

/*
EnclosingMethod_attribute {
    u2 attribute_name_index;
    u4 attribute_length;
    u2 class_index;
    u2 method_index;
}
 */
public class EnclosingMethodAttribute extends AttributeInfo {

    private U2CpIndex classIndex;
    private U2CpIndex methodIndex;
    
    @Override
    protected void readInfo(ClassReader reader) {
        classIndex = reader.readU2CpIndex();
        methodIndex = reader.readU2CpIndex();
    }
    
}
