package isosolver2.demo;

import isosolver2.Symmetry;
import isosolver2.SymmetryCombiner;

public class SymmetryDemo3 {

    public static void main(String[] args) {
        int vertexWeight = 360;
        int[] cycle1 = new int[]{90,90,36,36};
        //int[] cycle1 = new int[]{90,36,90,36};
        //int[] cycle2 = new int[]{90,36,72,60};
        int[] cycle2 = new int[]{90,36,60,72};
        //int[] cycle2 = new int[]{90,72,36,60};
        int[] cycle3 = new int[]{72,72,60,60};
        //int[] cycle3 = new int[]{72,60,72,60};
        Symmetry symmetryOne = new Symmetry(cycle1);
        Symmetry symmetryTwo = new Symmetry(cycle2);
        Symmetry symmetryThree = new Symmetry(cycle3);

        symmetryOne.createAllSymmetryCycles(vertexWeight);
        symmetryTwo.createAllSymmetryCycles(vertexWeight);
        symmetryThree.createAllSymmetryCycles(vertexWeight);

        SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
        combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo, symmetryThree);
        combinedSymmetry.solveCombinations();
    }
}
