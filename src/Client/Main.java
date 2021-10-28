package Client;

import Service.Operations.*;
import Service.Utils.PrintArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PrintArray printArray = new PrintArray();
        ContextOperations contextOperations = new ContextOperations();
        Unification unification = new Unification();
        Intersection intersection = new Intersection();
        Otherness otherness = new Otherness();
        SymmetricalDifference symmetricalDifference = new SymmetricalDifference();
        Scanner consoleA = new Scanner(System.in);
        Scanner consoleB = new Scanner(System.in);
        Scanner consoleO = new Scanner(System.in);

        String line = "";
        String lineB;
        int[] u = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a;
        int[] b;

        try {
            while (!(line.equalsIgnoreCase("break"))) {
                System.out.println("Вкажіть довжину масива A.\n");
                line = consoleA.nextLine();
                if (!(isItNum(line))) {
                    System.out.println("Ви ввели не число або масив не може" +
                            " бути створений!Спробуй ще раз.\n");
                    continue;
                } else if (Integer.parseInt(line) <= 0) {
                    System.out.println("\nМасив не може бути с твореней з 0 або менше елементів.\n");
                    continue;
                }
                a = new int[Integer.parseInt(line)];
                System.out.println("Введіть числа для масиву через пробіл.\n");
                for (int i = 0; i < Integer.parseInt(line); i++) {
                    a[i] = consoleA.nextInt();
                }
                System.out.println("Вкажіть довжину масива В.\n");
                lineB = consoleB.nextLine();
                if (!(isItNum(lineB))) {
                    System.out.println("Ви ввели не число або масив не може " +
                            "бути створений!Спробуй ще раз.\n");
                    continue;
                } else if (Integer.parseInt(lineB) <= 0) {
                    System.out.println("\nМасив не може бути с твореней з 0 або менше елементів.\n");
                    continue;
                }
                b = new int[Integer.parseInt(lineB)];
                System.out.println("Введіть числа для масиву через пробіл.\n");
                for (int i = 0; i < Integer.parseInt(lineB); i++) {
                    b[i] = consoleA.nextInt();
                }
                while (!(line.equalsIgnoreCase("break")
                        || line.equalsIgnoreCase("stop"))) {
                    System.out.println("Введіть число відповідне до операції яку бажаєте виконати:\n");
                    System.out.println("1:об’єднання");
                    System.out.println("2:перетин");
                    System.out.println("3:різниця");
                    System.out.println("4:доповнення");
                    System.out.println("5:симетрична різниця");
                    System.out.println("6:декартовий добуток\n");
                    line = consoleO.nextLine();
                    if (!(isItNum(line))) {
                        System.out.println("\nВи ввели не число!Спробуй ще раз.\n");
                        continue;
                    }
                    switch (Integer.parseInt(line)) {
                        case 1 -> {
                            contextOperations.setOperations(unification);
                            contextOperations.executeOperations(a, b);
                            printArray.printIntArrayInt(unification.getC());
                        }
                        case 2 -> {
                            contextOperations.setOperations(intersection);
                            contextOperations.executeOperations(a, b);
                            printArray.printIntArrayInt(intersection.getC());
                        }
                        case 3 -> {
                            contextOperations.setOperations(otherness);
                            contextOperations.executeOperations(a, b);
                            printArray.printIntArrayInt(otherness.getC());
                        }
                        case 4 -> {
                            contextOperations.setOperations(otherness);
                            System.out.println("Якій множині зробити доповнення а чи в?\n");
                            line = consoleO.nextLine();
                            if (line.equalsIgnoreCase("a")) {
                                contextOperations.executeOperations(u, a);
                            } else if (line.equalsIgnoreCase("b")) {
                                contextOperations.executeOperations(u, b);
                            } else {
                                System.out.println("Упс.Щось пішло не так\n");
                                continue;
                            }
                            printArray.printIntArrayInt(otherness.getC());
                        }
                        case 5 -> {
                            contextOperations.setOperations(symmetricalDifference);
                            contextOperations.executeOperations(a, b);
                            printArray.printIntArrayInt(symmetricalDifference.getC());
                        }
                        case 6 -> {
                            CartesianProduct cartesianProduct = new CartesianProduct(a, b);
                            contextOperations.setOperations(cartesianProduct);
                            contextOperations.executeOperations(a, b);
                            printArray.printStringArrayArray(cartesianProduct.getC());
                        }
                        default -> System.out.println("Немає такої операції\n");
                    }
                    System.out.println("""
                            Якщо бажаєте щоб програма завершила свою роботу напишіть "break".
                            Якщо бажаєте використати інші множини напишіть "stop".
                            """);
                }
                line = "";
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Програма завершила свою роботу");
        } catch (InputMismatchException arr) {
            System.out.println("Програма аварійно завершила свою роботу через те, " +
                    "що в масив було вписано не чило.");
        }
        consoleA.close();
        consoleB.close();
        consoleO.close();
    }

    static boolean isItNum(String line) {
        try {
            Integer.parseInt(line);
            return true;
        } catch (NumberFormatException e) {
            if (line.equalsIgnoreCase("break")) {
                throw new UnsupportedOperationException();
            }
            return false;
        }
    }
}
