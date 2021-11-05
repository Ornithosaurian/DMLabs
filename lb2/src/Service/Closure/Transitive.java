package Service.Closure;

public class Transitive implements Closure {

    @Override
    public void doClosure(int[][] A) {
        int T = A.length;
        int[][] val = new int[A.length+1][A.length+1];
        for(int k = 1; k < T; k++) {
            for(int i = 1; i < T; i++) {
                for(int j = 1; j < T; j++) {
                    A[i][j] = A[i][j] == 1 || A[i][k] == 1 && A[k][j] == 1 ? 1 : 0;
                }
            }
        }

    }

}
