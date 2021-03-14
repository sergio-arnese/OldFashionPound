package it.euris.oldfashionpound;

import java.util.ArrayList;
import java.util.List;

public class OldFashionPoundReader {

    public OldFashionPound fromString(String ofpRepresentation) {
        verifyNotEmptyRepresentation(ofpRepresentation);

        verifyExpectedOrder(getIndexOfPound(ofpRepresentation), getIndexOfShilling(ofpRepresentation), getIndexOfPenny(ofpRepresentation));

        ComponentsExtractor componentsExtractor = new ComponentsExtractor();

        int pounds = componentsExtractor.extractComponent(getIndexOfPound(ofpRepresentation), ofpRepresentation);
        int shillings = componentsExtractor.extractComponent(getIndexOfShilling(ofpRepresentation), ofpRepresentation);
        int pennies = componentsExtractor.extractComponent(getIndexOfPenny(ofpRepresentation), ofpRepresentation);

        return new OldFashionPound(pounds, shillings, pennies);
    }

    private void verifyNotEmptyRepresentation(String ofpRepresentation) {
        if( ofpRepresentation == null ) {
            throw new IllegalArgumentException("representation must be not null");
        }

        if( "".equals(ofpRepresentation) ) {
            throw new IllegalArgumentException("representation must be not null");
        }
    }

    private int getIndexOfPenny(String ofpRepresentation) {
        return ofpRepresentation.indexOf(OldFashionPoundRepresentation.PENNY_STRING_REPRESENTATION);
    }

    private int getIndexOfShilling(String ofpRepresentation) {
        return ofpRepresentation.indexOf(OldFashionPoundRepresentation.SHILLING_STRING_REPRESENTATION);
    }

    private int getIndexOfPound(String ofpRepresentation) {
        return ofpRepresentation.indexOf(OldFashionPoundRepresentation.POUND_STRING_REPRESENTATION);
    }

    private void verifyExpectedOrder(int indexOfPound, int indexOfShilling, int indexOfPenny) {
        List<Integer> indexes = new ArrayList<>();

        if( indexOfPound != -1 ) {
            indexes.add(indexOfPound);
        }

        if( indexOfShilling != -1 ) {
            indexes.add(indexOfShilling);
        }

        if( indexOfPenny != -1 ) {
            indexes.add(indexOfPenny);
        }

        if( indexes.size() == 0 ) {
            throw new IllegalArgumentException("empty representation is not allowed");
        }

        List<Integer> orderedIndexes = new ArrayList<>(indexes);

        orderedIndexes.sort(Integer::compareTo);

        if( ! indexes.equals(orderedIndexes) ) {
            throw new IllegalArgumentException("representation has not expected order: Xp Ys Zd");
        }
    }
}

