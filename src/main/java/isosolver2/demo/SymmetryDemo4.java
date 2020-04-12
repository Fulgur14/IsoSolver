package isosolver2.demo;

import isosolver2.Symmetry;
import isosolver2.SymmetryCombiner;

public class SymmetryDemo4 {

    public static void main(String[] args) {
        int vertexWeight = 200;
        int[] cycle1 = new int[]{48,48,48,48};
        int[] cycle2 = new int[]{49,49,49,49,49};
        int[] cycle3 = new int[]{51,51,51,51,51,51};
        int[] cycle4 = new int[]{52,52,52,52,52,52,52,52,52,52};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);
        Symmetry symmetryFour = new Symmetry(cycle4);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);
        symmetryFour.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree, symmetryFour);
        combinedSymmetry.solveCombinations();
    }
}
