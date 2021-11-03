package Service.Operations;

import java.util.Arrays;

public class Unification implements Operations {
    private int[] c;

    public int[] getC() {
        return c;
    }

    @Override
    public void doOperations(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a, 0, ab, 0, a.length);
        System.arraycopy(b, 0, ab, a.length, b.length);
        Arrays.sort(ab);
        int n = 1;
        for (int i = 1; i < ab.length; i++) {
            if (ab[i] != ab[i - 1]) n++;
        }
        c = new int[n];
        c[0] = ab[0];
        n = 1;
        for (int i = 1; i < ab.length; i++) {
            if (ab[i] != ab[i - 1]) c[n++] = ab[i];
        }
    }
}
