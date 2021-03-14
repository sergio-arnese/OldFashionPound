package it.euris.oldfashionpound;

import java.util.Objects;

public class OldFashionPound {
    private int pounds;
    private int shillings;
    private int pennies;
    private boolean isNegative = false;

    public OldFashionPound(int pounds, int shillings, int pennies) {
        init(getAsOnlyPennies(pounds, shillings, pennies));
    }

    private void init(int pennies) {
        OldFashionPoundComponents oldFashionPoundComponents = new OldFashionPoundComponents();
        this.pennies = oldFashionPoundComponents.getPennies(pennies);
        this.shillings = oldFashionPoundComponents.getShilling(pennies);
        this.pounds = oldFashionPoundComponents.getPounds(pennies);
    }

    public int getAsOnlyPennies() {
        return getAsOnlyPennies(this.pounds, this.shillings, this.pennies);
    }

    public int getPounds() {
        return pounds;
    }

    public int getShillings() {
        return shillings;
    }

    public int getPennies() {
        return this.pennies;
    }

    private int getAsOnlyPennies(int pounds, int shillings, int pennies) {
        return pounds* ConversionFactors.NUMBER_OF_PENCIES_IN_A_POUND + shillings* ConversionFactors.NUMBER_OF_PENCIES_IN_A_SHILLING + pennies;
    }

    public void setAsNegative() {
        this.isNegative = true;
    }

    public boolean isNegative() {
        return this.isNegative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OldFashionPound)) return false;
        OldFashionPound oldFashionPound = (OldFashionPound) o;
        return pounds == oldFashionPound.pounds && shillings == oldFashionPound.shillings && pennies == oldFashionPound.pennies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pounds, shillings, pennies);
    }
}
