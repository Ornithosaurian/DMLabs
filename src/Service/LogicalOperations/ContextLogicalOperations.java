package Service.LogicalOperations;

public class ContextLogicalOperations {
    LogicalOperations logicalOperations;

    public void setLogicalOperations(LogicalOperations logicalOperations) {
        this.logicalOperations = logicalOperations;
    }

    public void executeLogicalOperations(int[] a, int[] b) {
        logicalOperations.doLogicalOperations(a, b);
    }
}
