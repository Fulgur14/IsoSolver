package isosolver2;

import isosolver2.demo.FormatUtils;

import java.text.Format;
import java.util.ArrayList;

public class SymmetryWithEdgeTypes {
    final int[] edgeCycle;
    final int[] edgeTypes;
    final int numEdges;
    public ArrayList<IsohedralTilingSolver2Data> symmetryList = new ArrayList<>();
    int symmetryClasses;

    public SymmetryWithEdgeTypes(int[] edgeCycle, int[] edgeTypes) {
        this.edgeCycle = edgeCycle;
        this.edgeTypes = edgeTypes;
        this.numEdges = edgeCycle.length;
    }

    int computeFundamentalRotation (int[] edgeCycle, int[] edgeTypes) {
        aa:
        for (int i = 1; i <= edgeCycle.length ; i++) {
            for (int j = 0; j < edgeCycle.length; j++) {
                if ((edgeCycle[j] != edgeCycle[Math.floorMod(i+j, edgeCycle.length)]) || ((edgeTypes[j] != edgeTypes[Math.floorMod(i+j, edgeCycle.length)]))) {
                    continue aa;
                }
            }
            return i;
        }
        return 0;
    }

    int[] reverseArray(int[] edgeCycle) {
        int[] reverseCycle = new int[edgeCycle.length];
        for (int i = 0; i < reverseCycle.length; i++) {
            reverseCycle[i] = edgeCycle[edgeCycle.length - 1 - i];
        }
        return reverseCycle;
    }

    int[] reverseType(int[] edgeTypes) {
        int[] reverseTypes = new int[edgeTypes.length];
        reverseTypes[0] = edgeTypes[0];
        for (int i = 1; i < reverseTypes.length; i++) {
            reverseTypes[i] = edgeTypes[edgeTypes.length - i];
        }
        return reverseTypes;
    }

    boolean computeFundamentalReflection(int[] edgeCycle, int[] edgeTypes) {
        int[] reverseCycle = reverseArray(edgeCycle);
        int[] reverseTypes = reverseType(edgeTypes);
        aa:
        for (int i = 0; i < reverseCycle.length ; i++) {
            for (int j = 0; j < reverseCycle.length; j++) {
                if ((edgeCycle[j] != reverseCycle[Math.floorMod(i+j, reverseCycle.length)]) || (edgeTypes[j] != reverseTypes[Math.floorMod(i+j, reverseCycle.length)])) {
                    continue aa;
                }
            }
            return true;
        }
        return false;
    }

    int computeFundamentalAxes(boolean fundamentalReflection, int fundamentalRotationGroup) {
        if (fundamentalReflection) {
            return fundamentalRotationGroup;
        }
        else {
            return 0;
        }
    }

    IsohedralTilingSolver2Data createSymmetryCycle(int vertexWeight, int[] edgeCycle, int[] edgeTypes, boolean fundamentalReflection, int reflectionParameter) {
        if (!fundamentalReflection) {
            IsohedralTilingSolver2Data data = new IsohedralTilingSolver2Data(edgeCycle.length * 2);
            data.setDesiredVertexWeight(vertexWeight);
            int[] rightNeighbors = new int[edgeCycle.length*2];
            int[] leftNeighbors = new int[edgeCycle.length*2];
            int[] leftVertexWeights = new int[edgeCycle.length*2];
            int[] edgeMirrors = new int[edgeCycle.length*2];
            int[] types = new int[edgeCycle.length*2];
            for (int i = 0; i < edgeCycle.length; i++) {
                rightNeighbors[Math.floorMod(i - 1, edgeCycle.length)] = i;
                rightNeighbors[Math.floorMod(i + 1, edgeCycle.length) + edgeCycle.length] = i + edgeCycle.length;
                leftNeighbors[Math.floorMod(i + 1, edgeCycle.length)] = i;
                leftNeighbors[Math.floorMod(i - 1, edgeCycle.length) + edgeCycle.length] = i + edgeCycle.length;
                leftVertexWeights[Math.floorMod(i + 1, edgeCycle.length)] = edgeCycle[i];
                leftVertexWeights[i + edgeCycle.length] = edgeCycle[i];
                edgeMirrors[i] = i + edgeCycle.length;
                edgeMirrors[i + edgeCycle.length] = i;
                types[i] = edgeTypes[i];
                types[i + edgeCycle.length] = edgeTypes[i];
            }
            data.setEdgeRightNeighbors(rightNeighbors);
            data.setEdgeLeftNeighbors(leftNeighbors);
            data.setLeftVertexWeights(leftVertexWeights);
            data.setEdgeMirrors(edgeMirrors);
            data.setEdgeTypes(types);
            data.setMatchTypes(types);
            data.setEnsureConnectivity(true);
            return data;
        }
        else {
            IsohedralTilingSolver2Data data = new IsohedralTilingSolver2Data(edgeCycle.length);
            data.setDesiredVertexWeight(vertexWeight);
            int[] rightNeighbors = new int[edgeCycle.length];
            int[] leftNeighbors = new int[edgeCycle.length];
            int[] leftVertexWeights = new int[edgeCycle.length];
            int[] edgeMirrors = new int[edgeCycle.length];
            int[] reverseCycle = new int[edgeCycle.length];
            for (int i = 0; i < edgeCycle.length; i++) {
                reverseCycle[i] = edgeCycle.length - i - 1;
            }
            for (int i = 0; i < edgeCycle.length; i++) {
                rightNeighbors[Math.floorMod(i - 1, edgeCycle.length)] = i;
                leftNeighbors[Math.floorMod(i + 1, edgeCycle.length)] = i;
                leftVertexWeights[Math.floorMod(i + 1, edgeCycle.length)] = edgeCycle[i];
                edgeMirrors[i] = reverseCycle[Math.floorMod(i + reflectionParameter - 1,edgeCycle.length)];
            }
            data.setEdgeRightNeighbors(rightNeighbors);
            data.setEdgeLeftNeighbors(leftNeighbors);
            data.setLeftVertexWeights(leftVertexWeights);
            data.setEdgeMirrors(edgeMirrors);
            data.setEdgeTypes(edgeTypes);
            data.setMatchTypes(edgeTypes);
            data.setEnsureConnectivity(true);
            System.out.println(reflectionParameter + " " + FormatUtils.stringify(edgeCycle) + " " + FormatUtils.stringify(edgeTypes) + " " + FormatUtils.stringify(reverseCycle) + " " + FormatUtils.stringify(edgeMirrors) + " " + FormatUtils.stringify(edgeTypes));
            return data;
        }
    }
    public void createAllSymmetryCycles(int vertexWeight) {
        int fundamentalRotation = computeFundamentalRotation(edgeCycle,edgeTypes);
        int fundamentalRotationGroup = numEdges / fundamentalRotation;
        boolean fundamentalReflection = computeFundamentalReflection(edgeCycle,edgeTypes);
        int fundamentalAxes = computeFundamentalAxes(fundamentalReflection, fundamentalRotationGroup);

        for (int i = fundamentalRotation; i <= numEdges; i += fundamentalRotation) {
            if (numEdges % i == 0) {
                int[] quotient = new int[i];
                int[] quotientTypes = new int[i];
                System.arraycopy(edgeCycle, 0, quotient, 0, i);
                System.arraycopy(edgeTypes, 0, quotientTypes, 0, i);
                if (fundamentalReflection) {
                    int numAxes = fundamentalAxes*i/numEdges;
                    int[] axis = new int[2];
                    int[] reverseCycle = reverseArray(quotient);
                    int[] reverseTypes = reverseType(quotientTypes);
                    int axisIndex = 0;
                    int parity = Math.floorMod(numAxes, 2);
                    aa:
                    for (int j = 0; j < i; j++) {
                        for (int k = 0; k < i; k++) {
                            if ((quotient[k] != reverseCycle[Math.floorMod(j+k, i)]) || (quotientTypes[k] != reverseTypes[Math.floorMod(j+k, i)])) {
                                continue aa;
                            }
                        }
                        axis[axisIndex] = j;
                        axisIndex++;
                        if (axisIndex >= 2) {
                            break;
                        }
                    }
                    symmetryList.add(createSymmetryCycle(vertexWeight, quotient, quotientTypes,true, axis[0]));
                    if (parity == 0) {
                        symmetryList.add(createSymmetryCycle(vertexWeight, quotient, quotientTypes,true, axis[1]));
                    }
                }
                symmetryList.add(createSymmetryCycle(vertexWeight, quotient, quotientTypes,false, 0));
            }
        }
        symmetryClasses = symmetryList.size();
    }

    public int getSymmetryClasses() {
        return symmetryClasses;
    }
}
