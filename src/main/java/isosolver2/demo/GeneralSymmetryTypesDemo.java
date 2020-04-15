package isosolver2.demo;

import isosolver2.SymmetryCombiner;
import isosolver2.SymmetryCombinerWithEdgeTypes;

public class GeneralSymmetryTypesDemo {
    public static void main(String[] args) {
        SymmetryCombinerWithEdgeTypes symCom = new SymmetryCombinerWithEdgeTypes(54);
        symCom.addTile(new int[]{6,9,9}, new int[]{0,0,1});
        symCom.addTile(new int[]{6,9,9}, new int[]{0,0,1});
        symCom.addTile(new int[]{6,18,6,18}, new int[]{0,0,0,0});
        symCom.addTile(new int[]{9,12,9,18}, new int[]{1,0,0,1});
        symCom.combineLists();
        symCom.solveCombinations();
    }}
