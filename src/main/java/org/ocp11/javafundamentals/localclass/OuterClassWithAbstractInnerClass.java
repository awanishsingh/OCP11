package org.ocp11.javafundamentals.localclass;

public class OuterClassWithAbstractInnerClass {

    public abstract  class InnerClass {
        public abstract void printInner();
    }

    /*public void printOuter(){
        InnerClass inner = new InnerClass(){
            void printInner(){
                System.out.println("Inner");
            }
        };

    }*/
}
