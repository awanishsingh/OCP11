package org.ocp11.javafundamentals.innerclasses;

public class Parcel2FromOnJavaBook {

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
    public Contents contents(){
        return new Contents();
    }
    public Desitnation desitnation(String to){
        return new Desitnation(to);
    }
    public void ship(String dest){
        //Contents contents = new Contents();
        //Desitnation desitnation = new Desitnation(dest);
        Parcel2FromOnJavaBook  p = new Parcel2FromOnJavaBook();
        Contents c = p.contents();
        Desitnation d = p.desitnation("America");
        System.out.println(d.readLable());

    }




}
