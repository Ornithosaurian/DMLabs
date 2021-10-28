package Service.Operations;

public class ContextOperations {
    Operations operations;

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public void executeOperations(int[] a, int[] b) {
        operations.doOperations(a, b);
    }
}
