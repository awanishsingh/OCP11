package org.ocp11.javafundamentals;

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

    //
    public void callInner (){

        new Inner().go();
    }

    public static void main(String[] args) {
        new OuterClass().callInner();

    }
}
