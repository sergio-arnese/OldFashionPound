package it.euris.oldfashionpound;

public class OldFashionPoundWriter {

    public String toString(OldFashionPound oldFashionPound) {
        String completeRepresentation = "";

        if( oldFashionPound.getPounds() != 0 ) {
            completeRepresentation = oldFashionPound.getPounds() + OldFashionPoundRepresentation.POUND_STRING_REPRESENTATION;
        }

        if( !"".equals(completeRepresentation) || oldFashionPound.getShillings() != 0) {
            completeRepresentation += ( "".equals(completeRepresentation) ? "" : " " ) + oldFashionPound.getShillings() + OldFashionPoundRepresentation.SHILLING_STRING_REPRESENTATION;
        }

        completeRepresentation += ( "".equals(completeRepresentation) ? "" : " " ) + oldFashionPound.getPennies() + OldFashionPoundRepresentation.PENNY_STRING_REPRESENTATION;

        return (oldFashionPound.isNegative() ? "-": "") + completeRepresentation;
    }
}
