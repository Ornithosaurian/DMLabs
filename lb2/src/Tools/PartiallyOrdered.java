package Tools;

import Service.EquivalenceRatio.ContextEquivalenceRatio;
import Service.EquivalenceRatio.Reflexive;
import Service.EquivalenceRatio.Symmetry;
import Service.EquivalenceRatio.Transitivity;

public class PartiallyOrdered {
    public boolean partiallyOrdered(int[][] matrix){
        ContextEquivalenceRatio contextEquivalenceRatio1 = new ContextEquivalenceRatio();
        ContextEquivalenceRatio contextEquivalenceRatio2 = new ContextEquivalenceRatio();
        ContextEquivalenceRatio contextEquivalenceRatio3 = new ContextEquivalenceRatio();
        try {
            contextEquivalenceRatio1.setEquivalence(new Reflexive());
            contextEquivalenceRatio2.setEquivalence(new Symmetry());
            contextEquivalenceRatio3.setEquivalence(new Transitivity());
            if (contextEquivalenceRatio1.executeEquivalence(matrix) && contextEquivalenceRatio2.executeEquivalence(matrix)
            && contextEquivalenceRatio3.executeEquivalence(matrix)){
                return true;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        return false;
    }
}
