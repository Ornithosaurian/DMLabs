package Service.LogicalOperations;

public class XOR implements LogicalOperations {
    @Override
    public byte[] doLogicalOperations(int[] a, int[] b) {
        int k = Math.max(a.length, b.length);
        byte[] result = new byte[k];
        int i = 0;
        for (int c : a) {
            result[i] = (byte) (c ^ b[i++]);
        }
        return result;
    }
}
