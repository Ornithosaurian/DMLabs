package Service.Closure;

import java.util.Arrays;

public class Transitive implements Closure {
    final static int T = 5;

    @Override
    public void doClosure(int[][] A) {
        int newLength = A.length;
        int[][] trans = Arrays.copyOf(A, newLength);
        int T = trans.length;
        int i, j, k;
        for (i = 0; i < T; i++)
            for (j = 0; j < T; j++)
                trans[i][j] = A[i][j];
        for (k = 0; k < T; k++) {
            for (i = 0; i < T; i++) {
                for (j = 0; j < T; j++) {
                    trans[i][j] = trans[i][j] == 1 || trans[i][k] == 1 && trans[k][j] == 1 ? 1 : 0;
                }
            }
        }
    }
}
