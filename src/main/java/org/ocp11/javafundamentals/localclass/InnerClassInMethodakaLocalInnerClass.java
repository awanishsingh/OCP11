package org.ocp11.javafundamentals.localclass;

import org.ocp11.javafundamentals.innerclasses.Destination;

public class InnerClassInMethodakaLocalInnerClass {

    public Destination destination(String to) {

        class PDestination implements Destination {

            final String dest;

            public PDestination(String dest) {
                this.dest = dest;
            }

            @Override
            public String readLabel() {

                //<editor-fold desc="Description">
                return dest;
                //</editor-fold>
            }
        }

        Destination destination = new PDestination("localInnerClass");

        return destination;

    }
}
