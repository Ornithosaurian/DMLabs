package Service.LogicalOperations;

public class ContextLogicalOperations {
    LogicalOperations logicalOperations;

    public void setLogicalOperations(LogicalOperations logicalOperations) {
        this.logicalOperations = logicalOperations;
    }

    public int[] executeLogicalOperations(int[] a, int[] b) {
        return logicalOperations.doLogicalOperations(a, b);
    }
}
