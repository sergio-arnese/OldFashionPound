package it.euris.oldfashionpound;

class OldFashionPoundComponents
{
    public int getPounds(int fromPennies) {
        if (fromPennies < 0) {
            throw new IllegalArgumentException("argument must be great or equals to zero, but is: " + fromPennies);
        }

        return fromPennies / ConversionFactors.NUMBER_OF_PENCIES_IN_A_POUND;
    }

    public int getShilling(int fromPennies) {
        if (fromPennies < 0) {
            throw new IllegalArgumentException("argument must be great or equals to zero, but is: " + fromPennies);
        }

        int remaingPencies = fromPennies - (getPounds(fromPennies) * ConversionFactors.NUMBER_OF_PENCIES_IN_A_POUND);

        return remaingPencies / ConversionFactors.NUMBER_OF_PENCIES_IN_A_SHILLING;
    }

    public int getPennies(int fromPennies) {
        if (fromPennies < 0) {
            throw new IllegalArgumentException("argument must be great or equals to zero, but is: " + fromPennies);
        }

        return fromPennies - ((getPounds(fromPennies) * ConversionFactors.NUMBER_OF_PENCIES_IN_A_POUND) + (getShilling(fromPennies) * ConversionFactors.NUMBER_OF_PENCIES_IN_A_SHILLING));
    }
}
