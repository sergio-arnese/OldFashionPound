package it.euris.oldfashionpound;

public class OldFashionPoundOperations {

    public OldFashionPound sum(OldFashionPound oldFashionPound1, OldFashionPound oldFashionPound2) {
        if( oldFashionPound1 == null || oldFashionPound2 == null) {
            throw new IllegalArgumentException("arguments must be not null");
        }

        return getFromPennies(oldFashionPound1.getAsOnlyPennies() + oldFashionPound2.getAsOnlyPennies());
    }

    public OldFashionPound subtract(OldFashionPound oldFashionPound1, OldFashionPound oldFashionPound2) {
        if( oldFashionPound1 == null || oldFashionPound2 == null) {
            throw new IllegalArgumentException("arguments must be not null");
        }

        return getFromPennies(oldFashionPound1.getAsOnlyPennies() - oldFashionPound2.getAsOnlyPennies());
    }

    public OldFashionPound multiply(OldFashionPound oldFashionPound, int multiplicator) {
        if( multiplicator < 0 ) {
            throw new IllegalArgumentException("multiplicator (" + multiplicator + ") must be great or equals to zero");
        }

        return getFromPennies(oldFashionPound.getAsOnlyPennies()*multiplicator);
    }

    public OldFashionPoundPair divide(OldFashionPound oldFashionPound, int divisor) {
        if( divisor <= 0 ) {
            throw new IllegalArgumentException("divisor (" + divisor + ") must be great of zero");
        }

        OldFashionPound firstOldFashionPound = getFromPennies(oldFashionPound.getAsOnlyPennies() / divisor);
        OldFashionPound secondOldFashionPound = getFromPennies(oldFashionPound.getAsOnlyPennies() - firstOldFashionPound.getAsOnlyPennies()*divisor);

        return new OldFashionPoundPair(firstOldFashionPound, secondOldFashionPound);
    }

    private OldFashionPound getFromPennies(int fromPennies) {
        boolean isNegative = ( fromPennies < 0 );

        if( isNegative ) {
            fromPennies *=-1;
        }

        OldFashionPoundComponents oldFashionPoundComponents = new OldFashionPoundComponents();

        int pennies = oldFashionPoundComponents.getPennies(fromPennies);
        int shillings = oldFashionPoundComponents.getShilling(fromPennies);
        int pounds = oldFashionPoundComponents.getPounds(fromPennies);

        OldFashionPound oldFashionPound = new OldFashionPound(pounds, shillings, pennies);

        if (isNegative) {
            oldFashionPound.setAsNegative();
        }

        return oldFashionPound;
    }
}
