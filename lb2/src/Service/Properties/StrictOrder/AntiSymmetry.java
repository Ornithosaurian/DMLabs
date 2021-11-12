package Service.Properties.StrictOrder;

public class AntiSymmetry implements StrictOrder {
    @Override
    public boolean doStrictEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0].length != matrix.length) {
            throw new IllegalArgumentException();
        }
        int line = matrix.length;
        for (int l = 0; l < line; l++) {
            for (int p = 0; p < line; p++) {
                if (matrix[l][p] == 1) {
                    if (matrix[l][p] != matrix[p][l] && l != p) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
