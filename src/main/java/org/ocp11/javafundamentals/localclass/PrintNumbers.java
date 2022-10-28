package org.ocp11.javafundamentals.localclass;

import java.io.Serializable;

public class PrintNumbers {

    private int length =5;

    public void returnLocalClass (){
        //local class can not have access modifire
        //local class has scope only till method alive If the class implements Interface only then i can return the
        //interface ( upcast ) local class will not be visible out side of the method which created it.
        //class will be created only when the returnLocalClass method called.
        //public class MyLocalClass {
        class MyLocalClass implements Serializable {
            public  void printLocal(){
                System.out.println("local");
            }
        }
        MyLocalClass localClass= new MyLocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        PrintNumbers p = new PrintNumbers();
        p.returnLocalClass();
    }
}
