package isosolver2.demo;

import isosolver2.Symmetry;
import isosolver2.SymmetryCombiner;

public class SymmetryDemo6 {
    static void run1() {
        int vertexWeight = 132;
        int[] cycle1 = new int[]{33,24,33,44,66,44};
        int[] cycle2 = new int[]{33,24,33,44,66,44};
        int[] cycle3 = new int[]{33,24,33,44,66,44};
        int[] cycle4 = new int[]{33,24,33,44,66,44};
        int[] cycle5 = new int[]{12,33,88,33,12,66};
        int[] cycle6 = new int[]{12,33,88,33,12,66};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);
        Symmetry symmetrySix = new Symmetry(cycle6);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);
        symmetrySix.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive, symmetrySix);
        combinedSymmetry.solveCombinations();
    }
    static void run2() {
        int vertexWeight = 132;
        int[] cycle1 = new int[]{33,24,33,44,66,44};
        int[] cycle2 = new int[]{33,24,33,44,66,44};
        int[] cycle3 = new int[]{33,24,33,44,66,44};
        int[] cycle4 = new int[]{12,33,88,33,12,66};
        int[] cycle5 = new int[]{12,33,88,33,12,66};
        int[] cycle6 = new int[]{12,33,88,33,12,66};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);
        Symmetry symmetrySix = new Symmetry(cycle6);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);
        symmetrySix.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive, symmetrySix);
        combinedSymmetry.solveCombinations();
    }
    static void run3() {
        int vertexWeight = 132;
        int[] cycle1 = new int[]{33,24,33,44,66,44};
        int[] cycle2 = new int[]{33,24,33,44,66,44};
        int[] cycle3 = new int[]{12,33,88,33,12,66};
        int[] cycle4 = new int[]{12,33,88,33,12,66};
        int[] cycle5 = new int[]{12,33,88,33,12,66};
        int[] cycle6 = new int[]{12,33,88,33,12,66};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);
        Symmetry symmetrySix = new Symmetry(cycle6);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);
        symmetrySix.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive, symmetrySix);
        combinedSymmetry.solveCombinations();
    }
    static void run4() {
        int vertexWeight = 132;
        int[] cycle1 = new int[]{33,24,33,44,66,44};
        int[] cycle2 = new int[]{12,33,88,33,12,66};
        int[] cycle3 = new int[]{12,33,88,33,12,66};
        int[] cycle4 = new int[]{12,33,88,33,12,66};
        int[] cycle5 = new int[]{12,33,88,33,12,66};
        int[] cycle6 = new int[]{12,33,88,33,12,66};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);
        Symmetry symmetrySix = new Symmetry(cycle6);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);
        symmetrySix.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive, symmetrySix);
        combinedSymmetry.solveCombinations();
    }
    static void run5() {
        int vertexWeight = 84;
        int[] cycle1 = new int[]{21,24,21,28,42,28};
        int[] cycle2 = new int[]{12,21,56,21,12,42};
        int[] cycle3 = new int[]{12,21,56,21,12,42};
        int[] cycle4 = new int[]{12,21,56,21,12,42};
        int[] cycle5 = new int[]{12,21,56,21,12,42};
        int[] cycle6 = new int[]{12,21,56,21,12,42};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);
        Symmetry symmetryFive = new Symmetry(cycle5);
        Symmetry symmetrySix = new Symmetry(cycle6);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);
        symmetryFive.createAllSymmetryCycles(vertexWeight);
        symmetrySix.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour, symmetryFive, symmetrySix);
        combinedSymmetry.solveCombinations();
    }
    public static void main(String[] args) {
        run1();
        run2();
        run3();
        run4();
    }
}
