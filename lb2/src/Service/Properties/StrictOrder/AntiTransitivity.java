package Service.Properties.StrictOrder;

public class AntiTransitivity implements StrictOrder{
    @Override
    public boolean doStrictEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0].length != matrix.length) {
            throw new IllegalArgumentException();
        }
        for (int[] ints : matrix)
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] == 1) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[j][k] == 1) {
                            if (ints[k] != 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        return true;
    }
}
