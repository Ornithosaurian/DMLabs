package Service.LogicalOperations;


public class NOT implements LogicalOperations {
    public int[] doLogicalOperations(int[] a, int[] b, int[] u) {
        int[] resultNOT = new int[a.length];
        int i = 0;
        for (int temp : a) {
            resultNOT[i] = (byte) (~temp);
        }
        return resultNOT;
    }
}
