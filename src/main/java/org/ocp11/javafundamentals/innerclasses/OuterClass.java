package org.ocp11.javafundamentals.innerclasses;

public class OuterClass {

    private String greetings ="hello" ;


    protected  class Inner {

        public int repeat =3 ;
        public void go(){

            for(int i=0 ;i<repeat ;i++){
                System.out.println(greetings);
            }
        }
    }

    /* Creating instance using function calling using Outer method .
         <l> Creating instance in method
     */

    public void callInner (){

        new Inner().go();
    }
    /* using instance variable at the outer class */
    Inner in =new  Inner();
    Inner inInstanceInitializer ;
    {
        inInstanceInitializer=new Inner();
    }






    public static void main(String[] args) {
        //1
        System.out.println("Using outer instance method calling inner class method");
        new OuterClass().callInner();
        //2
        System.out.println("Using outer instance variable-> calling inner class method");
        new OuterClass().in.go();
        //3
        System.out.println("Using outer instance variable-> initialized using d");
        new OuterClass().inInstanceInitializer.go();

        //4
        System.out.println("Using outer instance then calling");
        new OuterClass().new Inner().go();

    }
}
