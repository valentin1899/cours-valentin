package net.virgapps.formation.java.tri;

import java.util.Arrays;

public class TempsCalculMax {
    public static void main(String[] args) {
        int[] tableau = TableauUtil.creerTableauRandom(10, 100);
        System.out.println(Arrays.toString(tableau));
        System.out.println(Arrays.toString(TableauUtil.triSelection(tableau)));
        System.out.println(Arrays.toString(TableauUtil.triFusion(tableau)));
    }
}
