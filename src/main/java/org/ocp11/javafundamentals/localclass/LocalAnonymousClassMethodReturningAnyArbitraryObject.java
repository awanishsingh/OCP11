package org.ocp11.javafundamentals.localclass;

public class LocalAnonymousClassMethodReturningAnyArbitraryObject {
  /*
  * You can’t have a named constructor in an anonymous class (because there’s no name).
  * With instance initialization,you can, in effect, create a constructor for an anonymous inner class, like this:
  * */
    public  Wrapper wrapper(int i ){

        return new Wrapper(i){
            @Override
            public int value(){
                return super.value()*47 ;
            }
        };

    }
}
