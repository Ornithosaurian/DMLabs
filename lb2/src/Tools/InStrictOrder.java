package Tools;

import Service.Properties.StrictOrder.ASymmetry;
import Service.Properties.StrictOrder.AntiReflexive;
import Service.Properties.StrictOrder.ContextStrictOrder;
import Service.Properties.StrictOrder.Transitivity;

public class InStrictOrder {
    public boolean inStrictOrder(int[][] matrix) {
        ContextStrictOrder contextStrictOrder1 = new ContextStrictOrder();
        ContextStrictOrder contextStrictOrder2 = new ContextStrictOrder();
        ContextStrictOrder contextStrictOrder3 = new ContextStrictOrder();
        try {
            contextStrictOrder1.setAntiEquivalenceRatio(new AntiReflexive());
            contextStrictOrder2.setAntiEquivalenceRatio(new ASymmetry());
            contextStrictOrder3.setAntiEquivalenceRatio(new Transitivity());
            if (contextStrictOrder1.executeAntiEquivalence(matrix) && contextStrictOrder2.executeAntiEquivalence(matrix)
                    && contextStrictOrder3.executeAntiEquivalence(matrix)) {
                return true;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        return false;
    }
}
