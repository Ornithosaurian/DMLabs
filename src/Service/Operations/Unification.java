package Service.Operations;

import java.util.Arrays;

public class Unification implements Operations {

    @Override
    public int[] doOperations(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a,0,ab,0,a.length);
        System.arraycopy(b,0,ab,a.length,b.length);
        Arrays.sort(ab);
        int n = 1;
        for (int i = 1; i < ab.length; i++) {
            if (ab[i] != ab[i-1]) n++;
        }
        int[] res = new int[n];
        res[0] = ab[0];
        n = 1;
        for (int i = 1; i < ab.length; i++) {
            if (ab[i] != ab[i-1]) res[n++] = ab[i];
        }
        return res;
    }
}
