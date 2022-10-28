package org.ocp11.javafundamentals.staticnestedclass;

import org.ocp11.javafundamentals.innerclasses.OuterClass;

public class EnclosingTest {




    public static void main(String[] args) {


        EnclosingClass.Staticnested staticnested = new EnclosingClass.Staticnested();
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner = outerClass.new Inner();
        inner.go();

    }

}
