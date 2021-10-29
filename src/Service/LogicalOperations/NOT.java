package Service.LogicalOperations;

import Service.Tools.Frombitlinetonumbers;
import Service.Tools.Mkbitline;

public class NOT implements LogicalOperations {
    public int[] doLogicalOperations(int[] a, int[] b, int[] u) {
        Mkbitline mkbitline = new Mkbitline();
        int[] abit = mkbitline.mkbitline(a, u);
        int[] resultNOT = new int[u.length];
        int i = 0;
        for (int temp : abit) {
            resultNOT[i] = (byte) (~temp);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        return frombitlinetonumbers.fbtlntnumb(resultNOT, u);
    }
}
