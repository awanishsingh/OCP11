package org.ocp11.javafundamentals.innerclasses;

public class OuterClass {

    private String greetings ="hello" ;


    /* Inner classes
    *   Inner class is not static, it has to be used with an instance of the outer class.
    *   Inner class can have variable with same name as outer class ,but in this case it will shadow the outer
    *   class variable .
    * */
    public  class Inner {
        //Shadow greetings="Hello"
        //this.greetings still refer the inner class variable .In order to acces Outer class variable
        //OuterClass.this.greetings
        private String greetings ="Hi Hello" ;
        public int repeat =3 ;
        public void go(){

            for(int i=0 ;i<repeat ;i++){
                System.out.println("refer to outer variable" + OuterClass.this.greetings);//refer to outer variable
                System.out.println("refer to inner class variable this.greetings"+this.greetings);//refer to inner class variable
                System.out.println("refer to inner class variable greetings"+ greetings);//refer to inner class variable

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
   public  Inner in =new  Inner();
   public Inner inInstanceInitializer ;
    {
        inInstanceInitializer=new Inner();
    }

   /*
   * <li> Inner class requires instance of the outer class .Below code does not complile if want to create instance<li>
   * <li> of inner class from static method
   * */

//    public static Inner creatInnerClass(){
//
//        return new Inner();
//    }




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
