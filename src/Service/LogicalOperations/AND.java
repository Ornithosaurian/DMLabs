package Service.LogicalOperations;

import Service.Tools.Frombitlinetonumbers;
import Service.Tools.Mkbitline;

public class AND implements LogicalOperations{
    public byte[] doLogicalOperations(int[] a, int[] b) {

        Mkbitline mkbitline = new Mkbitline();
        mkbitline.mkbitline(a, b);
        int k = Math.max(a.length, b.length);
        byte[] resultAND = new byte[k];
        int i = 0;
        if (b.length < a.length) {
            throw new IllegalArgumentException("Другий масив повинен бути >= першому");
        }
        for (int temp : a) {
            resultAND[i] = (byte) (temp & b[i++]);
        }
        Frombitlinetonumbers frombitlinetonumbers = new Frombitlinetonumbers();
        frombitlinetonumbers.fbtlntnumb(a, b);
        return resultAND;

    }
}