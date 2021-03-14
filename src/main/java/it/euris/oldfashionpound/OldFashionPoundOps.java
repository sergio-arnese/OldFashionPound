package it.euris.oldfashionpound;

public class OldFashionPoundOps {

    private OldFashionPoundReader oldFashionPoundReader = new OldFashionPoundReader();
    private OldFashionPoundOperations oldFashionPoundOperations = new OldFashionPoundOperations();
    private OldFashionPoundWriter oldFashionPoundWriter = new OldFashionPoundWriter();
    private OldFashionPoundPairWriter oldFashionPoundPairWriter = new OldFashionPoundPairWriter();

    public String sum(String oldFashionPoundAsString1, String oldFashionPoundAsString2) {
        OldFashionPound oldFashionPound1 = oldFashionPoundReader.fromString(oldFashionPoundAsString1);
        OldFashionPound oldFashionPound2 = oldFashionPoundReader.fromString(oldFashionPoundAsString2);

        OldFashionPound sum = oldFashionPoundOperations.sum(oldFashionPound1, oldFashionPound2);

        return oldFashionPoundWriter.toString(sum);
    }

    public String subtract(String oldFashionPoundAsString1, String oldFashionPoundAsString2) {
        OldFashionPound oldFashionPound1 = oldFashionPoundReader.fromString(oldFashionPoundAsString1);
        OldFashionPound oldFashionPound2 = oldFashionPoundReader.fromString(oldFashionPoundAsString2);

        OldFashionPound subtract = oldFashionPoundOperations.subtract(oldFashionPound1, oldFashionPound2);

        return oldFashionPoundWriter.toString(subtract);
    }

    public String multiply(String oldFashionPoundAsString, int multiplicator) {
        OldFashionPound oldFashionPound1 = oldFashionPoundReader.fromString(oldFashionPoundAsString);

        OldFashionPound multiply = oldFashionPoundOperations.multiply(oldFashionPound1, multiplicator);

        return oldFashionPoundWriter.toString(multiply);
    }

    public String divide(String oldFashionPoundAsString, int divisor) {
        OldFashionPound oldFashionPound1 = oldFashionPoundReader.fromString(oldFashionPoundAsString);

        OldFashionPoundPair divide = oldFashionPoundOperations.divide(oldFashionPound1, divisor);

        return oldFashionPoundPairWriter.toString(divide);
    }
}
