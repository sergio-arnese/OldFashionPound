package it.euris.oldfashionpound.test;

import it.euris.oldfashionpound.OldFashionPound;
import it.euris.oldfashionpound.OldFashionPoundReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OldFashionPoundReaderTest {
    @Test
    public void testOldFashionPoundReader() {
        OldFashionPound oldFashionPoundReaded =  new OldFashionPoundReader().fromString("1p 5s 0d");
        Assertions.assertEquals(new OldFashionPound(1,5,0), oldFashionPoundReaded);
    }

    @Test
    public void testOldFashionPoundReaderNoShillings() {
        OldFashionPound oldFashionPoundReaded =  new OldFashionPoundReader().fromString("1p 0d");
        Assertions.assertEquals(new OldFashionPound(1,0,0), oldFashionPoundReaded);
    }

    @Test
    public void testOldFashionPoundReaderNoPounds() {
        OldFashionPound oldFashionPoundReaded =  new OldFashionPoundReader().fromString("5s 0d");
        Assertions.assertEquals(new OldFashionPound(0,5,0), oldFashionPoundReaded);
    }

    @Test
    public void testOldFashionPoundReaderNoPoundsUnexpectedOrder() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new OldFashionPoundReader().fromString("5s 1p 0d"));
        String excMessage = exception.getMessage();
        String expectedExcMessage = "representation has not expected order: Xp Ys Zd";

        assertTrue(excMessage.contains(expectedExcMessage));
    }

    @Test
    public void testOldFashionPoundReaderNoPoundsUnexpectedRepresentation() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new OldFashionPoundReader().fromString("5a 1b 0c"));
        String excMessage = exception.getMessage();
        String expectedExcMessage = "empty representation is not allowed";

        assertTrue(excMessage.contains(expectedExcMessage));
    }
}
