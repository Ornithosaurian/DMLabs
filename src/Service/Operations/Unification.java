package Service.Operations;

public class Unification implements Operations {
    @Override
    public int[] doOperations(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a,0,ab,0,a.length);
        System.arraycopy(b,0,ab,a.length,b.length);

        return ab;
    }
}
