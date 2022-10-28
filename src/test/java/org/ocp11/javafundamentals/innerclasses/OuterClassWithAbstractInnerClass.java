package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;
import org.ocp11.javafundamentals.localclass.LocalAnonymousClassMethodReturningAnyArbitraryObject;
import org.ocp11.javafundamentals.localclass.Wrapper;

public class OuterClassWithAbstractInnerClass {


    public void testOuterClassWithAbstractInnerClass(){
        org.ocp11.javafundamentals.localclass.OuterClassWithAbstractInnerClass outer = new org.ocp11.javafundamentals.localclass.OuterClassWithAbstractInnerClass();
        org.ocp11.javafundamentals.localclass.OuterClassWithAbstractInnerClass.InnerClass in = outer.new InnerClass() {

            @Override
            public void printInner() {
                System.out.println("Printer Inner abstractClass");
            }
        };
        in.printInner();
    }
}
