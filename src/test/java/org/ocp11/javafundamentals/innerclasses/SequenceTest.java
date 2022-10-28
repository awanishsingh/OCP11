package org.ocp11.javafundamentals.innerclasses;

import org.junit.Test;

public class SequenceTest {

     @Test
    public void testSequence(){
        Sequence sequence = new Sequence(10);
        //Sequence.Selector selector = sequence.selector();
        Selector selector = sequence.selector();
        for(int i=0 ;i<10;i++){
            sequence.add(Integer.toString(i));
        }
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
