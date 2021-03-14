package it.euris.oldfashionpound;

class ComponentsExtractor {
    private int currIndex = 0;

    public int extractComponent(int indexOfComponent, String ofpRepresentation) {
        if (indexOfComponent != -1) {
            int extractedPennies = Integer.parseInt(ofpRepresentation.substring(currIndex, indexOfComponent).trim());
            this.currIndex = indexOfComponent + 1;
            return extractedPennies;
        } else {
            return 0;
        }
    }
}
