package Service.Operations;

public class CartesianProduct implements Operations {
    public String[][] c;

    CartesianProduct(int[] a, int[] b) {
        c = new String[a.length][b.length];
    }

    public String[][] getC() {
        return c;
    }

    @Override
    public void doOperations(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = "(" + a[i] + "," + b[j] + ")";
            }
        }
    }
}
