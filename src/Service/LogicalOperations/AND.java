package Service.LogicalOperations;

import Service.Tools.Frombitlinetonumbers;
import Service.Tools.Mkbitline;

public class AND implements LogicalOperations {
    public int[] doLogicalOperations(int[] a, int[] b, int[] u) {

        Mkbitline mkbitline = new Mkbitline();
        int[] abit = mkbitline.mkbitline(a, u);
        int[] bbit = mkbitline.mkbitline(b, u);
        int[] resultAND = new int[u.length];
        int i = 0;
        for (int temp : a) {
            resultAND[i] = (byte) (temp & b[i++]);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        return frombitlinetonumbers.fbtlntnumb(resultAND, u);

    }
}