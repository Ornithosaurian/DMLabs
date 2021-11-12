package Client;

import Service.Closure.ContextClosure;
import Service.Closure.Symmetric;
import Service.Closure.Transitive;
import Service.Compose;
import Service.Properties.NotStrictOrder.ContextEquivalenceRatio;
import Service.Properties.NotStrictOrder.Reflexive;
import Service.Properties.NotStrictOrder.Symmetry;
import Service.Properties.NotStrictOrder.Transitivity;
import Service.Properties.StrictOrder.*;
import Service.Utils.PrintArray;
import Tools.EquivalentsRatio;
import Tools.InStrictOrder;
import Tools.PartiallyOrdered;

public class Main {
    public static void main(String[] args) {
        ContextEquivalenceRatio contextEquivalenceRatio = new ContextEquivalenceRatio();
        ContextStrictOrder antiEquivalenceRatio = new ContextStrictOrder();
        PartiallyOrdered partiallyOrdered = new PartiallyOrdered();
        Compose compose = new Compose();
        PrintArray printArray = new PrintArray();
        ContextClosure contextClosure = new ContextClosure();
        EquivalentsRatio equivalentsRatio = new EquivalentsRatio();
        InStrictOrder inStrictOrder = new InStrictOrder();
        int[][] A = {
                {1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 0, 1}
        };
        try {
            contextEquivalenceRatio.setEquivalence(new Reflexive());
            System.out.println("Рефлексивність:");
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
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new ASymmetry());
            System.out.println("Асиметричність:");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new AntiSymmetry());
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
            antiEquivalenceRatio.setAntiEquivalenceRatio(new AntiTransitivity());
            System.out.println("Антитранзитивнысть:");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            antiEquivalenceRatio.setAntiEquivalenceRatio(new Service.Properties.StrictOrder.Transitivity());
            System.out.println("Транзитивність(a < b, b < c):");
            System.out.println(antiEquivalenceRatio.executeAntiEquivalence(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        System.out.println("Відношенням еквівалентності");
        System.out.println(equivalentsRatio.equivalentsRatio(A));
        System.out.println("Частковим порядком:");
        System.out.println(partiallyOrdered.partiallyOrdered(A));
        System.out.println("Строгим порядком:");
        System.out.println(inStrictOrder.inStrictOrder(A));
        try {
            System.out.println("2 степінь відношення:\n");
            printArray.printIntArray(compose.square(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        try {
            System.out.println("3 степінь відношення:\n");
            printArray.printIntArray(compose.cube(A));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
        /*try {
            contextClosure.setClosure(new Transitive());
            System.out.println("Транзитивне замикання:");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }*/
        /*try {
            contextClosure.setClosure(new Symmetric());
            System.out.println("Симетричне замикання:");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }*/
        try {
            contextClosure.setClosure(new Service.Closure.Reflexive());
            System.out.println("Рефлексивне замикання:");
            contextClosure.executeClosure(A);
            printArray.printIntArray(A);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exception");
        }
    }
}
