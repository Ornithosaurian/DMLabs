package Service.Operations;

public class SymmetricalDifference implements Operations{

    @Override
    public int[] doOperations(int[] a, int[] b) {
        ContextOperations intersection = new ContextOperations();
        intersection.setOperations(new Intersection());
        int[] c = intersection.executeOperations(a,b);
        ContextOperations unification = new ContextOperations();
        unification.setOperations(new Unification());
        int[] ab = unification.executeOperations(a,b);
        ContextOperations otherness = new ContextOperations();
        otherness.setOperations(new Otherness());
        return otherness.executeOperations(ab,c);
    }
}
