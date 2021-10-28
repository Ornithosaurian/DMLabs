package Service.Operations;

public class SymmetricalDifference implements Operations {
    public int[] c;

    public int[] getC() {
        return c;
    }

    @Override
    public void doOperations(int[] a, int[] b) {
        ContextOperations intersection = new ContextOperations();
        Intersection intersection1 = new Intersection();
        intersection.setOperations(intersection1);
        intersection.executeOperations(a, b);
        int[] g = intersection1.getC();
        ContextOperations unification = new ContextOperations();
        Unification unification1 = new Unification();
        unification.setOperations(unification1);
        unification.executeOperations(a, b);
        int[] ab = unification1.getC();
        ContextOperations otherness = new ContextOperations();
        Otherness otherness1 = new Otherness();
        otherness.setOperations(otherness1);
        otherness.executeOperations(ab, g);
        c = otherness1.getC();
    }
}
