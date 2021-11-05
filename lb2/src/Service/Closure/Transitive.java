package Service.Closure;

public class Transitive implements Closure {

    @Override
    public void doClosure(int[][] A) {
        int T = A.length;
        for(int k = 0; k < T; k++) {
            for(int i = 0; i < T; i++) {
                for(int j = 0; j < T; j++) {
                    A[i][j] = A[i][j] == 1 || A[i][k] == 1 && A[k][j] == 1 ? 1 : 0;
                }
            }
        }
    }

}
