package Service.Closure;

public class Reflexive implements Closure {
    @Override
    public void doClosure(int[][] A) {
        int[][] one = new int[A.length+1][A.length+1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != one[i][j]) {
                    A[i][j] = 1;
                }
            }
        }
    }
}

