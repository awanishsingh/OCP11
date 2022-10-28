package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;
import org.ocp11.javafundamentals.localclass.LocalAnonymousClass;
import org.ocp11.javafundamentals.localclass.LocalAnonymousClassMethodReturningAnyArbitraryObject;
import org.ocp11.javafundamentals.localclass.OuterClassWithAbstractInnerClass;
import org.ocp11.javafundamentals.localclass.Wrapper;

public class LocalAnonymousClassTest {
    
    @Test
    public void testAnonymousClass(){

        LocalAnonymousClass l = new LocalAnonymousClass();
        Destination d = l.destination("Delhi");
        System.out.println(d.readLabel());

    }
    @Test
    public void testLocalAnonymousClassMethodReturningAnyArbitraryObject(){
        LocalAnonymousClassMethodReturningAnyArbitraryObject p = new LocalAnonymousClassMethodReturningAnyArbitraryObject();
        Wrapper w = p.wrapper(5);
        System.out.println(w.value());
        OuterClassWithAbstractInnerClass outer = new OuterClassWithAbstractInnerClass();
        OuterClassWithAbstractInnerClass.InnerClass in = outer.new InnerClass() {

            @Override
            public void printInner() {

            }
        };

    }
}
