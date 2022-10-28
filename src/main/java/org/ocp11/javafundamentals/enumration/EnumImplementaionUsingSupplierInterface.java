package org.ocp11.javafundamentals.enumration;

import java.util.Random;
import java.util.function.Supplier;

enum CartoonCharacterImplementingSupplierInterface implements
        Supplier<CartoonCharacterImplementingSupplierInterface> {
    //Enum had to define the enum instances first before defining any methods or var
    // ; is optional only in case there is only enum and no variable or methods defined
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    Random random = new Random(47);

    //values() methods returns all the enum instances as Array
    @Override
    public CartoonCharacterImplementingSupplierInterface get() {
        return values()[random.nextInt(values().length)];
    }
}

public class EnumImplementaionUsingSupplierInterface {

    public static <T> void  printNext(Supplier<T> rg){
        System.out.print(rg.get() + ",");
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //i need to pass the enum instance to call method
            printNext(CartoonCharacterImplementingSupplierInterface.BOB);
        }
    }


}
