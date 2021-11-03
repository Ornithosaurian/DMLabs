package Service.EquivalenceRatio.NotStrictOrder;

public class Symmetry implements EquivalenceRatio {
    @Override
    public boolean doEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0].length != matrix.length) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        int line = matrix.length;
        for (int l = 0; l < line; l++) {
            for (int p = 0; p < line; p++) {
                if (matrix[l][p] == 1) {
                    if (matrix[l][p] != matrix[p][l]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
