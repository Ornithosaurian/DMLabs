package Service.EquivalenceRatio.StrictOrder;

public class ContextStrictOrder {
    StrictOrder strictOrder;

    public void setAntiEquivalenceRatio(StrictOrder antiEquivalenceRatio) {
        this.strictOrder = antiEquivalenceRatio;
    }

    public boolean executeAntiEquivalence(int[][] matrix){
        return strictOrder.doStrictEquivalence(matrix);
    }
}
