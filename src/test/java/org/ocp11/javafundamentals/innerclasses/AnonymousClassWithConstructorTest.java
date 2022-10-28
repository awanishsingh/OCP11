package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;
import org.ocp11.javafundamentals.localclass.AnonymousClassWithConstructor;
import org.ocp11.javafundamentals.localclass.Base;

public class AnonymousClassWithConstructorTest {
    @Test
    public void testAnonymousClassWithConstructor(){
        AnonymousClassWithConstructor any = new AnonymousClassWithConstructor();
        Base b = any.getBase(5);
        System.out.println(b.f());


    }
}
