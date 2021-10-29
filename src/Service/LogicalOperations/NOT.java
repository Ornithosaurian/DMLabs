package Service.LogicalOperations;

import Service.Tools.Frombitlinetonumbers;
import Service.Tools.Mkbitline;

public class NOT implements LogicalOperations{
    public byte[] doLogicalOperations(int[] a, int[] b) {
        Mkbitline mkbitline = new Mkbitline();
        mkbitline.mkbitline(abit, bbit);
        int k = Math.max(a.length, b.length);
        byte[] resultNOT = new byte[k];
        int i = 0;
        if (b.length < a.length) {
            throw new IllegalArgumentException("Другий масив повинен бути >= першому");
        }
        for (int temp : abit) {
            resultNOT[i] = (byte) (temp ~ bbit[i++]);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        frombitlinetonumbers.fbtlntnumb(a, b);
        return resultNOT;
    }
}
