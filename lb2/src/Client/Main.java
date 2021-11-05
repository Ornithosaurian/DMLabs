package Client;

import Service.Closure.ContextClosure;
import Service.Closure.Symmetric;
import Service.Closure.Transitive;
import Service.Compose;
import Service.EquivalenceRatio.NotStrictOrder.ContextEquivalenceRatio;
import Service.EquivalenceRatio.NotStrictOrder.Reflexive;
import Service.EquivalenceRatio.NotStrictOrder.Symmetry;
import Service.EquivalenceRatio.NotStrictOrder.Transitivity;
import Service.EquivalenceRatio.StrictOrder.ASymmetry;
import Service.EquivalenceRatio.StrictOrder.AntiReflexive;
import Service.EquivalenceRatio.StrictOrder.ContextStrictOrder;
import Service.Utils.PrintArray;
import Tools.PartiallyOrdered;

public class Main {
    public static void main(String[] args) {
        ContextEquivalenceRatio contextEquivalenceRatio = new ContextEquivalenceRatio();
        ContextStrictOrder antiEquivalenceRatio = new ContextStrictOrder();
        PartiallyOrdered partiallyOrdered = new PartiallyOrdered();
        Compose compose = new Compose();
        PrintArray printArray = new PrintArray();
        ContextClosure contextClosure = new ContextClosure();
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
        try {
            System.out.println("2 степінь відношення:\n");
            printArray.printIntArray(compose.square(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            System.out.println("3 степінь відношення:\n");
            printArray.printIntArray(compose.square(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        /*try {
            contextClosure.setClosure(new Service.Closure.Reflexive());
            System.out.println("Рефлексивне замикання:");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }*/
        /*try {
            contextClosure.setClosure(new Transitive());
            System.out.println("Транзитивне замикання:\n");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }*/
        try {
            contextClosure.setClosure(new Symmetric());
            System.out.println("Симетричне замикання:\n");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
    }
}
