package Service.Operations;

import java.util.Arrays;

public class Intersection implements Operations {

    @Override
    public int[] doOperations(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a, 0, ab, 0, a.length);
        System.arraycopy(b, 0, ab, a.length, b.length);
        Arrays.sort(ab);
        int n = 0;
        for (int i = 0; i < ab.length - 1; i++) {
            for (int j = i + 1; j < ab.length; j++) {
                if (ab[i] == ab[j]) {
                    n++;
                }
            }
        }
        if (n == 0) {
            return new int[0];
        }
        int[] res = new int[n];
        n = 0;
        for (int i = 0; i < ab.length - 1; i++) {
            for (int j = i + 1; j < ab.length; j++) {
                if (ab[i] == ab[j]) {
                    res[n] = ab[i];
                    n++;
                }
            }
        }
        return res;
    }
}
