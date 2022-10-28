package org.ocp11.javafundamentals.interfaces;

/**
 * If the multiple interfaces have same  method signature then implementing class need to override the method
 * to resolve the conflict.
 * <ul>
 *     <li>Implementing class can call Interface method using Interface.super.methodName keyword </li>
 *
 * </ul>
 */
public class ClassImplementingMultipleInterfaces implements Interface2,Interface1{
    @Override
    public int getValue() {
        return Interface1.super.getValue();
    }

    public  int getValueUsingInterface1Method(){

        return Interface2.super.getValue();
    }
}
