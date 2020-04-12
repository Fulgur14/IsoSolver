package isosolver2.demo;

import isosolver2.Symmetry;
import isosolver2.SymmetryCombiner;

public class SymmetryDemo5 {

    static void run1() {
        int vertexWeight = 132;
        int[] cycle1 = new int[]{33,24,33,44,66,44};
        int[] cycle2 = new int[]{12,33,88,33,12,66};
        int[] cycle3 = new int[]{12,33,88,33,12,66};
        int[] cycle4 = new int[]{12,33,88,33,12,66};
        int[] cycle5 = new int[]{12,33,88,33,12,66};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive);
        combinedSymmetry.solveCombinations();
    }
    static void run4() {
        int vertexWeight = 4121;
        int[] cycle1 = new int[]{1001,1001,1001};
        int[] cycle2 = new int[]{1100,1100,1100,1100};
        int[] cycle3 = new int[]{1010,1010,1010,1010,1010};
        int[] cycle4 = new int[]{1010,1010,1010,1010,1010};
        int[] cycle5 = new int[]{1010,1010,1010,1010,1010};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive);
        combinedSymmetry.solveCombinations();
    }
    static void run3() {
        int vertexWeight = 360;
        int[] cycle1 = new int[]{72,72,72,120};
        int[] cycle2 = new int[]{72,72,72,120};
        int[] cycle3 = new int[]{72,72,72,120};
        int[] cycle4 = new int[]{72,72,72,120};
        int[] cycle5 = new int[]{72,72,72,120};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive);
        combinedSymmetry.solveCombinations();
    }
    static void run2() {
        int vertexWeight = 360;
        int[] cycle1 = new int[]{72,72,72,120};
        int[] cycle2 = new int[]{72,72,72,120};
        int[] cycle3 = new int[]{72,72,72,120};
        int[] cycle4 = new int[]{72,72,72,120};
        int[] cycle5 = new int[]{72,72,72,120};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive);
        combinedSymmetry.solveCombinations();
    }
    public static void main(String[] args) {
        run1();
    }
}
