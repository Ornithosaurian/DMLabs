package Service.Closure;

import java.util.Arrays;

public class Reflexive implements Closure {
    @Override
    public void doClosure(int[][] A) {
        int newLength = A.length;
        int[][] ref = Arrays.copyOf(A, newLength);
        int R = ref.length;
        int[][] one = new int[R][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < R; j++) {
                if (ref[i][j] != one[i][j]) {
                    ref[i][j] = 1;
                }
            }
        }
    }
}

