package Service.LogicalOperations;

import Service.Tools.Mkbitline;
import Service.Tools.Frombitlinetonumbers;

public class XOR implements LogicalOperations {
    public int[] doLogicalOperations(int[] a, int[] b,int[] u) {
        Mkbitline mkbitline = new Mkbitline();
        int[] abit =  mkbitline.mkbitline(a,u);
        int[] bbit =  mkbitline.mkbitline(b,u);
        int[] resultXOR = new int[u.length];
        int i = 0;
        for (int temp : abit) {
            resultXOR[i] = (byte) (temp ^ bbit[i++]);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        return frombitlinetonumbers.fbtlntnumb(resultXOR, u);
    }
}
