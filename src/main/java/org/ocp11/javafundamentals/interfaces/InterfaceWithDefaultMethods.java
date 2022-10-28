package org.ocp11.javafundamentals.interfaces;

/**
 * <p>
 *      java Interface can have a abstract methods( implicit abstract and public) and the Constant.
 *      With Java 8 Interface can have methods
 *      <ul>
 *          <li>default methods: is a regular method with default keyword</li>
 *          <li>default method can be define inside a Interface Only</li>
 *          <li>A default method cannot be marked abstract, final, or static</li>
 *          <li>static methods : regular static methods</li>
 *          <li>A default method may be overridden by a class implementing the interface</li>
 *          <li>Interface can have only default methods only</li>
 *          <li>default method can call static method but vice versa not true </li>
 *      </ul>
 * <p><!-- --></p>
 * </p>
 */
public interface InterfaceWithDefaultMethods {
    //Regular abstract method
    void print();
    //default method
    default double getTemprature(){
       printStatic();
        return 10.0;
    }

    static void printStatic(){
        //System.out.println("print"+ getTemprature());
        System.out.println("print");
    }

}
