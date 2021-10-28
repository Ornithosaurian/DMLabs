package Service.Operations;

import java.util.Arrays;

public class Otherness implements Operations {

    @Override
    public int[] doOperations(int[] a, int[] b) {
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
            return new int[0];
        }
        int[] res = new int[a.length - n];
        n = 0;
        int k = 0;
        for (int i : a) {
            for (int j : b) {
                if (i != j) {
                    k++;
                }
            }
            if (k == b.length) {
                res[n] = i;
                n++;
            }
            k = 0;
        }

        return res;
    }
}
