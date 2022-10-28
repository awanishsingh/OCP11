package org.ocp11.javafundamentals.interfaces;

public interface InterfaceWithPrivateMethods {

    default void wake(){
        checkTime(8);
    }
    default void breakFast(){
        checkTime(9);
    }
    //using private static method
    default void printsomething(){
      print();
    }
    //calling private static from the public static
    public static void printStatic(){
        print();
    }
    private void checkTime(int hour){
        if(hour>17){
            System.out.println("you are late");
        }else{
            //private static can be called from non static
            print();
            System.out.println("you  have " + (17-hour) +"let for appointment");
        }
    }
    private static void print(){
        System.out.println("printing from private static method");
    }
}
