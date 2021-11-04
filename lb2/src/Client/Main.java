package Client;

import Service.EquivalenceRatio.NotStrictOrder.ContextEquivalenceRatio;
import Service.EquivalenceRatio.NotStrictOrder.Reflexive;
import Service.EquivalenceRatio.NotStrictOrder.Symmetry;
import Service.EquivalenceRatio.NotStrictOrder.Transitivity;
import Service.EquivalenceRatio.StrictOrder.ASymmetry;
import Service.EquivalenceRatio.StrictOrder.AntiReflexive;
import Service.EquivalenceRatio.StrictOrder.ContextStrictOrder;
import Service.Closure.Transitive;
import Tools.PartiallyOrdered;

public class Main {
    public static void main(String[] args) {
        ContextEquivalenceRatio contextEquivalenceRatio = new ContextEquivalenceRatio();
        ContextStrictOrder antiEquivalenceRatio = new ContextStrictOrder();
        PartiallyOrdered partiallyOrdered = new PartiallyOrdered();
        int[][] A = {{1, 0, 1, 0, 1}, {1, 0, 1, 1, 0}, {0, 1, 0, 0, 1}, {1, 0, 1, 0, 0}, {1, 0, 0, 0, 0}};
        try {
            contextEquivalenceRatio.setEquivalence(new Reflexive());
            System.out.println("Рефлективність:");
            System.out.println(contextEquivalenceRatio.executeEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            contextEquivalenceRatio.setEquivalence(new Symmetry());
            System.out.println("Симетричність:");
            System.out.println(contextEquivalenceRatio.executeEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            contextEquivalenceRatio.setEquivalence(new Transitivity());
            System.out.println("Транзитивність:");
            System.out.println(contextEquivalenceRatio.executeEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        System.out.println("Частковим порядком:");
        System.out.println(partiallyOrdered.partiallyOrdered(A));
        try {
            contextEquivalenceRatio.setEquivalence(new Reflexive());
            System.out.println("Рефлективність:");
            System.out.println(contextEquivalenceRatio.executeEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            contextEquivalenceRatio.setEquivalence(new Symmetry());
            System.out.println("Симетричність:");
            System.out.println(contextEquivalenceRatio.executeEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new ASymmetry());
            System.out.println("Антисиметричність:");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new AntiReflexive());
            System.out.println("Антирефлексивність:");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new Service.EquivalenceRatio.StrictOrder.Transitivity());
            System.out.println("Транзитивність(a < b, b < c):");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
    }
}
