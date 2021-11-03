package Service.EquivalenceRatio.NotStrictOrder;

public class ContextEquivalenceRatio {
    EquivalenceRatio equivalenceRatio;

    public void setEquivalence(EquivalenceRatio equivalenceRatio) {
        this.equivalenceRatio = equivalenceRatio;
    }

    public boolean executeEquivalence(int[][] matrix){
        return equivalenceRatio.doEquivalence(matrix);
    }
}
