package Service.LogicalOperations;


public class NOT implements LogicalOperations {
    public int[] doLogicalOperations(int[] a, int[] b) {
        int[] resultNOT = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if (a[i]==b[i])
                resultNOT[i] = 0;
            else{
                resultNOT[i] = 1;
            }
        }
            
        return resultNOT;
    }
}
