package it.euris.oldfashionpound.test;

import it.euris.oldfashionpound.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OldFashionPoundOperationsTest {
    @Test
    public void test12Pennies() {
        OldFashionPound sum = new OldFashionPoundOperations().sum(new OldFashionPound(0,0,12), new OldFashionPound(0,0,0));
        Assertions.assertEquals(new OldFashionPound(0,1,0), sum);
    }

    @Test
    public void test20Shillings() {
        OldFashionPound sum = new OldFashionPoundOperations().sum(new OldFashionPound(0,20,0), new OldFashionPound(0,0,0));
        Assertions.assertEquals(new OldFashionPound(1,0,0), sum);
    }

    @Test
    public void testSumOneToOne() {
        OldFashionPound sum =  new OldFashionPoundOperations().sum(new OldFashionPound(1,0,0), new OldFashionPound(1,0,0));
        Assertions.assertEquals(new OldFashionPound(2,0,0), sum);
    }

    @Test
    public void testSumByExample() {
        // 5p 17s 8d + 3p 4s 10d= 9p 2s 6d
        OldFashionPound sum =  new OldFashionPoundOperations().sum(new OldFashionPound(5,17,8), new OldFashionPound(3,4,10));
        Assertions.assertEquals(new OldFashionPound(9,2,6), sum);
    }

    @Test
    public void testSubtractionByExample() {
        // 5p 17s 8d - 3p 4s 10d= 2p 12s 10d
        OldFashionPound subtract =  new OldFashionPoundOperations().subtract(new OldFashionPound(5,17,8), new OldFashionPound(3,4,10));
        Assertions.assertEquals(new OldFashionPound(2,12,10), subtract);
    }

    @Test
    public void testMultiplyByExample() {
        // 5p 17s 8d * 2 = 11p 15 s 4d
        OldFashionPound multiply =  new OldFashionPoundOperations().multiply(new OldFashionPound(5,17,8), 2);
        Assertions.assertEquals(new OldFashionPound(11,15,4), multiply);
    }

    @Test
    public void testDivisionFirstExample() {
        // 5p 17s 8d / 3 = 1p 19s 2d (2p)
        OldFashionPoundPair divisionPair =  new OldFashionPoundOperations().divide(new OldFashionPound(5,17,8), 3);
        Assertions.assertEquals(new OldFashionPound(1,19,2), divisionPair.getFirstOldFashionPound());
        Assertions.assertEquals(new OldFashionPound(0,0,2), divisionPair.getSecondOldFashionPound());
    }

    @Test
    public void testDivisionSecondExample() {
        //  18p 16s 1d / 15 = 1p 5s 0d (1s 1d)
        OldFashionPoundPair divisionPair =  new OldFashionPoundOperations().divide(new OldFashionPound(18,16,1), 15);
        Assertions.assertEquals(new OldFashionPound(1,5,0), divisionPair.getFirstOldFashionPound());
        Assertions.assertEquals(new OldFashionPound(0,1,1), divisionPair.getSecondOldFashionPound());
    }
}
