package org.ocp11.javafundamentals.nestedclass;

import org.junit.Test;
import org.ocp11.javafundamentals.staticnestedclass.NestedClassInsideInterface;

public class NestedClassInsideInterfaceTest {
    @Test
    public void testNestedClassInsideInterface(){
        NestedClassInsideInterface c = new NestedClassInsideInterface.Test();
        c.print();
    }
}
