package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;

public class Parcel1FromOnJavaBookTest {
    Parcel1FromOnJavaBook parcel1FromOnJavaBook= new Parcel1FromOnJavaBook();
    Parcel2FromOnJavaBook parcel2FromOnJavaBook= new Parcel2FromOnJavaBook();
    @Test
    public void testInnerClassFeatures(){

        parcel1FromOnJavaBook.ship("Delhi");
    }
    @Test
    public void testInnerClassFeatures1(){
        parcel2FromOnJavaBook.ship("America");
        //Getting reference of the inner class from Enclosing class instance ;
        /* <p>To make an object of the inner class anywhere except from within a non-static</p>
        //<p>method of the outer class, you must specify the type of that object as OuterClass-Name.InnerClassName
        //</p>

         */
        Parcel2FromOnJavaBook.Contents c = parcel2FromOnJavaBook.contents();
        Parcel2FromOnJavaBook.Desitnation d = parcel2FromOnJavaBook.desitnation("somewhere");
    }
}
