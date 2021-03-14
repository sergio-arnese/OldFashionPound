package it.euris;

import it.euris.oldfashionpound.OldFashionPoundOps;

public class OldFashionPoundUsage {
    public static void main(String[] args) {
        OldFashionPoundOps oldFashionPoundOps = new OldFashionPoundOps();

        System.out.println("Reporting some examples of usage of library " + OldFashionPoundOps.class.getSimpleName());
        System.out.println("5p 17s 8d + 3p 4s 10d = " + oldFashionPoundOps.sum("5p 17s 8d", "3p 4s 10d"));
        System.out.println("5p 17s 8d - 3p 4s 10d = " + oldFashionPoundOps.subtract("5p 17s 8d", "3p 4s 10d"));
        System.out.println("5p 17s 8d * 2 = " + oldFashionPoundOps.multiply("5p 17s 8d", 2));
        System.out.println("5p 17s 8d / 3 = " + oldFashionPoundOps.divide("5p 17s 8d", 3));
    }
}
