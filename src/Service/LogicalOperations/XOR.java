package Service.LogicalOperations;

import Service.Tools.Mkbitline;
import Service.Tools.Frombitlinetonumbers;

public class XOR implements LogicalOperations {
    public byte[] doLogicalOperations(int[] a, int[] b) {
        Mkbitline mkbitline = new Mkbitline();
        mkbitline.mkbitline(abit, bbit);
        int k = Math.max(a.length, b.length);
        byte[] resultXOR = new byte[k];
        int i = 0;
        if (b.length < a.length) {
            throw new IllegalArgumentException("Другий масив повинен бути >= першому");
        }
        for (int temp : abit) {
            resultXOR[i] = (byte) (temp ^ bbit[i++]);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        frombitlinetonumbers.fbtlntnumb(a, b);
        return resultXOR;
    }
}
