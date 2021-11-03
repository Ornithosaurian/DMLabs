package Service.EquivalenceRatio.StrictOrder;

public class ContextAntiEquivalenceRatio {
    AntiEquivalenceRatio antiEquivalenceRatio;

    public void setAntiEquivalenceRatio(AntiEquivalenceRatio antiEquivalenceRatio) {
        this.antiEquivalenceRatio = antiEquivalenceRatio;
    }

    public boolean executeAntiEquivalence(int[][] matrix){
        return antiEquivalenceRatio.doAntiEquivalence(matrix);
    }
}
