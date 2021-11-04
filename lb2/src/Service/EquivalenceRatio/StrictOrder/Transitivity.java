package Service.EquivalenceRatio.StrictOrder;

public class Transitivity implements StrictOrder {
    @Override
    public boolean doAntiEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0].length != matrix.length) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1 || i == j) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[j][k] == 1 || j == k) {
                            if (matrix[i][k] != 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        return true;
    }
}
