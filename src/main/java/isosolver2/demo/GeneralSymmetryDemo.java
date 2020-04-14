package isosolver2.demo;

import isosolver2.SymmetryCombiner;

public class GeneralSymmetryDemo {
    public static void main(String[] args) {
        new SymmetryCombiner(54,
                new int[]{6,9,9}
                //new int[]{6,9,9},
                //new int[]{6,18,6,18},
                //new int[]{9,12,9,18}
        ).solveCombinations();
    }
}
