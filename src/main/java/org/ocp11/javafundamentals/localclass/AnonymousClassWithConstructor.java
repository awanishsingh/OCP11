package org.ocp11.javafundamentals.localclass;

public class AnonymousClassWithConstructor {

    public  Base getBase(int i){

        return new Base(i) {
            @Override
            public int f() {
                System.out.println("Inside the base Anonymous Implementation" +super.getI());
                return super.getI();
            }
        };
    }


}


