package org.ocp11.javafundamentals.staticnestedclass;

import org.ocp11.javafundamentals.innerclasses.Contents;
import org.ocp11.javafundamentals.innerclasses.Destination;

/**
 * Static Inner class called as nested class as well .
 * <ul>
 *     <li> Static Inner (nested) class can not access the enclosing class instance level fields or methods </li>
 *     <li> Static Inner (nested) class can does not need a reference to enclosing class in order to create it Instance </li>
 *     <li> Nested class can access Enclosing class static field or methods </li>
 *     <li>Static inner class can define static and not static methods unlike inner class which requires Enclosing
 *     class reference and can only define non static field or methods</li>
 *     <li>There is no implicit this reference available to nested class</li>
 *     <li>Enclosing class can access the nested class Static field or methods with ClassName and dot </li>
 * </ul>
 */
public class EnclosingClass {

    private int enclosingClassInstanceField = 1;

    public void printEnclosingClass() {
        System.out.println("Enclosing instance method");
    }

    public static void printStaticMethodEnclosingClass() {
        System.out.println("Enclosing instance method");
        System.out.println("Enclosing instance method accessing static inner class static method");
        Staticnested.staticMethodInsideNestedClasswithProtected();

    }

    /**
     * A nested class can also have inner class and nested class
     */

    public static class Staticnested {
        private int instanceVariable = 1;

        private void instancePrint() {
            // System.out.println("Instance method called" + enclosingClassInstanceField);
            System.out.println("Instance method called");
            printStaticMethodEnclosingClass();

        }

        protected void instancePrintWithProtected() {
            System.out.println("Instance method called");

        }

        private static final void staticMethodInsideNestedClass() {
            System.out.println("StaticMethodInsideNestedClass method called");
        }

        protected static void staticMethodInsideNestedClasswithProtected() {
            System.out.println("StaticMethodInsideNestedClass method called");
        }
        //Nested withing nested class
        public static class A{}
        //Inner within nested class
        public class B{}
    }

    public static class PDestination implements Destination {
        private String dest;
        PDestination(String to){
            this.dest=to;
        }
        @Override
        public String readLabel() {
            return dest;
        }
    }

    public static class PContents implements Contents {
        private int value ;
        public PContents(int i){
            this.value=i;
        }
        @Override
        public int value() {
            return value;
        }
    }
    public static Contents contents(int value ){
        return new PContents(value);
    }
    public static Destination destination(String to){
        return new PDestination(to);
    }

    public static void main(String[] args) {
        /**
         * Static class does not requires Enclosing class instance in order to create
         * object instance of the nested class
         */
        Staticnested staticnested = new Staticnested();
        System.out.println("Instance private Variable :" + staticnested.instanceVariable);
        System.out.println("Instance private method");
        staticnested.instancePrint();
        System.out.println("StaticMethodInsideNestedClass private method");
        staticnested.staticMethodInsideNestedClass();
        Contents c = contents(10);
        Destination d = destination("Europe");
        System.out.println("Destination" + d.readLabel());
        System.out.println("Contents" + c.value());

    }


}
