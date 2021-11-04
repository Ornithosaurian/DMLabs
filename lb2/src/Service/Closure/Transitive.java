package Service.Closure;

public class Transitive implements Closure {

    @Override
    public int[][] doClosure(int[][] matrix) {
        int T = matrix.length;
        for(int k = 0; k < T; k++) {
            for(int i = 0; i < T; i++) {
                for(int j = 0; j < T; j++) {
                    matrix[i][j] = matrix[i][j] == 1 || matrix[i][k] == 1 && matrix[k][j] == 1 ? 1 : 0;
                }
            }
        }
        return matrix;
    }
}
