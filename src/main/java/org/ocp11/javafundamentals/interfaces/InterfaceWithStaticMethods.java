package org.ocp11.javafundamentals.interfaces;

/**
 * <p>Interface can have static methods just as regular static methods</p>
 * <ul>
 *     <li>if the method mark as static interface then it must have body , Implicit public access modifier</li>
 *     <li>static interface method can not be marked as abstract or final</li>
 *     <li>static method can not be inherited Implementing class need to use Interface name to call methods</li>
 *     <li>A class defined in the interface is public static </li>
 * </ul>
 */
public interface InterfaceWithStaticMethods {
    static void print(){
        System.out.println("static interface method");
    }

      class impl implements InterfaceWithStaticMethods {
        public static void print(){
             InterfaceWithStaticMethods.print();
        }
    }
}
