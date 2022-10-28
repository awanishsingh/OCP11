package org.ocp11.javafundamentals.innerclasses;

public class Sequence {
    //Interface as inner interface can have public , protected and private access modifier .Visibility rules
    //applied as regular class variable .
//   private interface Selector {
//        boolean end();
//        Object current();
//        void next();
//    }
//    protected  interface Selector {
//        boolean end();
//        Object current();
//        void next();
//    }
    /*public interface Selector {
        boolean end();
        Object current();
        void next();
    }*/

    private Object[] items ;
    private  int next=0;
    public Sequence(int size){
      items=new Object[size];
    }
    public void  add(Object x){
        if(next<items.length){
            items[next++]=x;
        }
    }
    private class SequeceSelector implements Selector {
        private int i ;
        @Override
        public boolean end() {
            //Inner class accessing private field of the enclosing class
            //The inner class secretly captures a reference to the particular object
            //of the enclosing class that was responsible for creating it.
            return i== items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
         if(i< items.length){i++;}
        }
    }

    public  Selector selector(){
        return  new SequeceSelector();
    }



}
//We can define interfae out side of the public class as well.This will reduce the clutter
//we do not have type outer class name everytime we want to refer to the Interface type
//OuterClassName.InterfaceType e.g  //Sequence.Selector selector = sequence.selector();
//Only difference is Interface need to be public ( implicit ) non other access modifier applicable (private , protected ,public)
 interface Selector {
    boolean end();
    Object current();
    void next();
}
