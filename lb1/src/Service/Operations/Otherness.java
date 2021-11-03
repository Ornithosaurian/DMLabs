package Service.Operations;

import java.util.Arrays;

public class Otherness implements Operations {
    private int[] c;

    public int[] getC() {
        return c;
    }

    @Override
    public void doOperations(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = 0;
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    n++;
                    break;
                }
            }
        }
        if (n == 0) {
            c = new int[0];
        }
        c = new int[a.length - n];
        n = 0;
        int k = 0;
        for (int i : a) {
            for (int j : b) {
                if (i != j) {
                    k++;
                }
            }
            if (k == b.length) {
                c[n] = i;
                n++;
            }
            k = 0;
        }
    }
}
