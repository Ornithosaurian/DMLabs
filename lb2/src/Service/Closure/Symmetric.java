package Service.Closure;

public class Symmetric implements Closure {
    @Override
    public void doClosure(int[][] A) {
        for (int i = 0; i < A.length; i++) { // transpon
            for (int j = i + 1; j < A.length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) { // sym  closure
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != A[j][i]) {
                    A[i][j] = 1;
                }
            }
        }
    }
}
