package org.ocp11.javafundamentals.localclass;

public class TestLocal {

    public static void main(String[] args) {
        OuterClassWithAbstractInnerClass outerClassWithAbstractInnerClass = new OuterClassWithAbstractInnerClass();
        OuterClassWithAbstractInnerClass.InnerClass in = outerClassWithAbstractInnerClass.new InnerClass() {
            @Override
            public void printInner() {
                System.out.println("Abstract inner local class");
            }
        };
        in.printInner();
    }

}
