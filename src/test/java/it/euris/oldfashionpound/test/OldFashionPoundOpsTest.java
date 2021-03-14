package it.euris.oldfashionpound.test;

import it.euris.oldfashionpound.OldFashionPoundOps;
import org.junit.jupiter.api.*;

public class OldFashionPoundOpsTest {

    @Test
    public void testOldFashionPoundOpsSum() {
        // 5p 17s 8d + 3p 4s 10d= 9p 2s 6d
        String sum = new OldFashionPoundOps().sum("5p 17s 8d", "3p 4s 10d");
        Assertions.assertEquals("9p 2s 6d", sum);
    }

    @Test
    public void testOldFashionPoundOpsSubtraction() {
        // 5p 17s 8d - 3p 4s 10d= 2p 12s 10d
        String subtract = new OldFashionPoundOps().subtract("5p 17s 8d", "3p 4s 10d");
        Assertions.assertEquals("2p 12s 10d", subtract);
    }

    @Test
    public void testOldFashionPoundOpsSubtractionNegativeResult() {
        // 5p 17s 8d - 13p 4s 10d= 2p 12s 10d
        String subtract = new OldFashionPoundOps().subtract("5p 17s 8d", "13p 4s 10d");
        Assertions.assertEquals("-7p 7s 2d", subtract);
    }

    @Test
    public void testOldFashionPoundOpsMultiplication() {
        // 5p 17s 8d * 2 = 11p 15 s 4d
        String multiply = new OldFashionPoundOps().multiply("5p 17s 8d", 2);
        Assertions.assertEquals("11p 15s 4d", multiply);
    }

    @Test
    public void testOldFashionPoundOpsDivision() {
        // 6p 18s 9d / 3 = 2p 9s 3d
        String multiply = new OldFashionPoundOps().divide("6p 18s 9d", 3);
        Assertions.assertEquals("2p 6s 3d", multiply);
    }
}
