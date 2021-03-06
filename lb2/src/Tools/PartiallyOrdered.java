package Tools;

import Service.Properties.NotStrictOrder.ContextEquivalenceRatio;
import Service.Properties.NotStrictOrder.Reflexive;
import Service.Properties.NotStrictOrder.Transitivity;
import Service.Properties.StrictOrder.AntiSymmetry;
import Service.Properties.StrictOrder.ContextStrictOrder;

public class PartiallyOrdered {
    public boolean partiallyOrdered(int[][] matrix) {
        ContextEquivalenceRatio contextEquivalenceRatio1 = new ContextEquivalenceRatio();
        ContextEquivalenceRatio contextEquivalenceRatio2 = new ContextEquivalenceRatio();
        ContextStrictOrder contextStrictOrder = new ContextStrictOrder();
        try {
            contextEquivalenceRatio1.setEquivalence(new Reflexive());
            contextStrictOrder.setAntiEquivalenceRatio(new AntiSymmetry());
            contextEquivalenceRatio2.setEquivalence(new Transitivity());
            if (contextEquivalenceRatio1.executeEquivalence(matrix) && contextStrictOrder.executeAntiEquivalence(matrix)
                    && contextEquivalenceRatio2.executeEquivalence(matrix)) {
                return true;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        return false;
    }
}
