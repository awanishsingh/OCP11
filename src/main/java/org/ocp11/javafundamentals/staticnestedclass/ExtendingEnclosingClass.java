package org.ocp11.javafundamentals.staticnestedclass;

public class ExtendingEnclosingClass extends EnclosingClass{


    public static void main(String[] args) {
        EnclosingClass enclosingClass = new EnclosingClass();
        EnclosingClass.Staticnested staticnested = new Staticnested();
        Staticnested staticnested1 = new Staticnested();
        //Protected static method
        EnclosingClass.Staticnested.staticMethodInsideNestedClasswithProtected();
        staticnested1.staticMethodInsideNestedClasswithProtected();
        staticnested1.instancePrintWithProtected();
    }
}
