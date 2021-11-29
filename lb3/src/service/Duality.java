
package service;

public class Duality {
    public String[] findDuality(String[] F) {
        String[] f = new String[F.length];
        for (int i = 0; i < F.length; i++) {
            if (F[i].equals("0")) {
                f[F.length - 1 - i] = "1";
            } else {
                f[F.length - 1 - i] = "0";
            }
        }
        return f;
    }
}
