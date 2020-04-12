package isosolver2.demo;

import isosolver2.IsohedralTilingSolver2;
import isosolver2.IsohedralTilingSolver2Data;
import isosolver2.Symmetry;
import isosolver2.SymmetryCombiner;

import java.util.List;

public class SymmetryDemo {
	public static void main(String[] args) {
		int vertexWeight = 200;
		int[] cycle1 = new int[]{48,48,48,48};
		int[] cycle2 = new int[]{52,52,52,52,52,52,52,52,52,52};
		//int[] cycle2 = new int[]{1,1,1,1,2,1,2,1,1,1,1,2,1,2};
		//int[] cycle2 = new int[]{1,1,1,2,1,1,1,2,1,1,1,2};
		Symmetry symmetryOne = new Symmetry(cycle1);
		Symmetry symmetryTwo = new Symmetry(cycle2);

		symmetryOne.createAllSymmetryCycles(vertexWeight);
		symmetryTwo.createAllSymmetryCycles(vertexWeight);

		SymmetryCombiner combinedSymmetry = new SymmetryCombiner();
		combinedSymmetry.combineLists(vertexWeight, symmetryOne, symmetryTwo);
		combinedSymmetry.solveCombinations();
	}

}
