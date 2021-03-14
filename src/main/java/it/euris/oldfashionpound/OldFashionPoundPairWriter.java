package it.euris.oldfashionpound;

public class OldFashionPoundPairWriter {

    public String toString(OldFashionPoundPair oldFashionPoundPair) {
        OldFashionPoundWriter oldFashionPoundWriter = new OldFashionPoundWriter();

        OldFashionPound zero = new OldFashionPound(0,0,0);

        return oldFashionPoundWriter.toString(oldFashionPoundPair.getFirstOldFashionPound()) +
                (zero.equals(oldFashionPoundPair.getSecondOldFashionPound()) ? "" : " (" + oldFashionPoundWriter.toString(oldFashionPoundPair.getSecondOldFashionPound()) +")" );
    }
}
