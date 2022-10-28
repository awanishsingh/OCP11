package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;
import org.ocp11.javafundamentals.localclass.InnerClassInMethodakaLocalInnerClass;

public class InnerClassInMethodakaLocalInnerClassTest {
    @Test
    public void testInnerClassInMethodakaLocalInnerClass() {
        InnerClassInMethodakaLocalInnerClass p = new InnerClassInMethodakaLocalInnerClass();
        Destination d = p.destination("localInnerClassUsingOutSide");
        System.out.println(d.readLabel());



    }
}
