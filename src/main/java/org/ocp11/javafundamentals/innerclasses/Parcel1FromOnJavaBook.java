package org.ocp11.javafundamentals.innerclasses;

public class Parcel1FromOnJavaBook {

    class Contents {
      private int value =11;
      public int value(){ return value;}
    }

    class Desitnation {
        private String whereTo;

        Desitnation(String whereTo){
            this.whereTo=whereTo;
        }
        String readLable(){return whereTo;}
    }

    public void ship(String dest){
        Contents contents = new Contents();
        Desitnation desitnation = new Desitnation(dest);
        System.out.println(desitnation.readLable());
    }




}
