package Service.Operations;

public class ContextOperations {
    Operations operations;

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public int[] executeOperations(int[] a, int[] b) {
        return operations.doOperations(a, b);
    }
}
