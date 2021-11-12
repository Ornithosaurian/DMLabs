package Service.Closure;

import java.util.Arrays;

public class Symmetric implements Closure {
    @Override
    public void doClosure(int[][] A) {
        int newLength = A.length;
        int[][] symm = Arrays.copyOf(A, newLength);
        int S = symm.length;
        for (int i = 0; i < S; i++) { // transpon
            for (int j = i + 1; j < S; j++) {
                int temp = symm[i][j];
                symm[i][j] = symm[j][i];
                symm[j][i] = temp;
            }
        }
        for (int i = 0; i < S; i++) { // sym  closure
            for (int j = 0; j < S; j++) {
                if (symm[i][j] != symm[j][i]) {
                    symm[i][j] = 1;
                }
            }
        }
    }
}
