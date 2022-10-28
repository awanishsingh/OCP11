package org.ocp11.javafundamentals.staticnestedclass;
/**
 * A nested class can be part of an interface. Any class you put inside an interface
 * is automatically public and static.
 * <p></p>
 * <ul>
 *     <li> You can even implement the surrounding interface in the inner class</li>
 * </ul>
 */
public interface NestedClassInsideInterface {
    void print();

    class Test implements NestedClassInsideInterface {

        @Override
        public void print() {
            System.out.println("printing inside the class in interface");
        }

        public static void main(String[] args) {
            Test t = new Test();
            t.print();
        }
    }
}
