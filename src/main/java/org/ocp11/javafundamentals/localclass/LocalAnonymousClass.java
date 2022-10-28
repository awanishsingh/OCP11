package org.ocp11.javafundamentals.localclass;

import org.ocp11.javafundamentals.innerclasses.Destination;


public class LocalAnonymousClass {
   //We can perform initialization when there is field in anonymous class
    public Destination destination(final String to){
        //to;
        return new Destination() {
            @Override
            public String readLabel() {
                return to;
            }
        };

    }
}
