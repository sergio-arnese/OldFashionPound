package it.euris.oldfashionpound.test;

import it.euris.oldfashionpound.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OldFashionPoundWriterTest {
    @Test
    public void testOldFashionPoundToStringRepresentation() {
        OldFashionPound oldFashionPound =  new OldFashionPound(5,17,8);
        Assertions.assertEquals("5p 17s 8d", new OldFashionPoundWriter().toString(oldFashionPound));
    }

    @Test
    public void testOldFashionPoundToStringRepresentationZeroPound() {
        OldFashionPound oldFashionPound =  new OldFashionPound(0,3,8);
        Assertions.assertEquals("3s 8d", new OldFashionPoundWriter().toString(oldFashionPound));
    }

    @Test
    public void testOldFashionPoundToStringRepresentationZeroPoundAndZeroShilling() {
        OldFashionPound oldFashionPound =  new OldFashionPound(0,0,8);
        Assertions.assertEquals("8d", new OldFashionPoundWriter().toString(oldFashionPound));
    }

    @Test
    public void testOldFashionPoundToStringRepresentationZeroShilling() {
        OldFashionPound oldFashionPound =  new OldFashionPound(5,0,8);
        Assertions.assertEquals("5p 0s 8d", new OldFashionPoundWriter().toString(oldFashionPound));
    }

    @Test
    public void testOldFashionPoundToStringRepresentationZeroOldFashionPound() {
        OldFashionPound zero =  new OldFashionPound(0,0,0);
        Assertions.assertEquals("0d", new OldFashionPoundWriter().toString(zero));
    }

    @Test
    public void testOldFashionPoundPairToStringRepresentationFirstExample() {
        // 5p 17s 8d / 3 = 1p 19s 2d (2p)
        OldFashionPoundPair divisionPair =  new OldFashionPoundOperations().divide(new OldFashionPound(5,17,8), 3);
        Assertions.assertEquals("1p 19s 2d (2d)", new OldFashionPoundPairWriter().toString(divisionPair));
    }

    @Test
    public void testOldFashionPoundPairToStringRepresentationSecondExample() {
        //  18p 16s 1d / 15 = 1p 5s 0d (1s 1d)
        OldFashionPoundPair divisionPair =  new OldFashionPoundOperations().divide(new OldFashionPound(18,16,1), 15);
        Assertions.assertEquals("1p 5s 0d (1s 1d)", new OldFashionPoundPairWriter().toString(divisionPair));
    }
}
