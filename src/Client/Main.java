package Client;

import Service.LogicalOperations.*;
import Service.Operations.*;
import Service.Tools.Check;
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
        ContextLogicalOperations contextLogicalOperations = new ContextLogicalOperations();
        XOR xor = new XOR();
        OR or = new OR();
        NOT not = new NOT();
        AND and = new AND();
        Check check = new Check();
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
                    System.out.println("6:декартовий добуток");
                    System.out.println("7:XOR");
                    System.out.println("8:OR");
                    System.out.println("9:NOT");
                    System.out.println("10:AND");
                    System.out.println("11:Перевірити чи є множина підмножиною іншої\n");
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
                        case 7 -> {
                            contextLogicalOperations.setLogicalOperations(xor);
                            printArray.printIntArrayInt(contextLogicalOperations.executeLogicalOperations(a, b, u));
                        }
                        case 8 -> {
                            contextLogicalOperations.setLogicalOperations(or);
                            printArray.printIntArrayInt(contextLogicalOperations.executeLogicalOperations(a, b, u));
                        }
                        case 9 -> {
                            contextLogicalOperations.setLogicalOperations(not);
                            System.out.println("Над якою множиною бажаєте виконати операцію а чи в?\n");
                            line = consoleO.nextLine();
                            if (line.equalsIgnoreCase("a")) {
                                printArray.printIntArrayInt(contextLogicalOperations.executeLogicalOperations(a, b, u));
                            } else if (line.equalsIgnoreCase("b")) {
                                printArray.printIntArrayInt(contextLogicalOperations.executeLogicalOperations(b, a, u));
                            } else {
                                System.out.println("Упс.Щось пішло не так\n");
                                continue;
                            }
                        }
                        case 10 -> {
                            contextLogicalOperations.setLogicalOperations(and);
                            printArray.printIntArrayInt(contextLogicalOperations.executeLogicalOperations(a, b, u));
                        }
                        case 11 -> {
                            System.out.println("Введіть множини через enter над якими хочете провести операції.\n");
                            line = consoleO.nextLine();
                            lineB = consoleA.nextLine();
                            if (line.equalsIgnoreCase("a")) {
                                if (lineB.equalsIgnoreCase("b")) {
                                    if (check.twoArrsCheck(a, b)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("u")) {
                                    if (check.twoArrsCheck(a, u)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("a")) {
                                    if (check.twoArrsCheck(a, a)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else {
                                    System.out.println("Упс.Щось пішло не так\n");
                                    continue;
                                }
                            } else if (line.equalsIgnoreCase("b")) {
                                if (lineB.equalsIgnoreCase("b")) {
                                    if (check.twoArrsCheck(b, b)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("u")) {
                                    if (check.twoArrsCheck(b, u)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("a")) {
                                    if (check.twoArrsCheck(b, a)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else {
                                    System.out.println("Упс.Щось пішло не так\n");
                                    continue;
                                }
                            } else if (line.equalsIgnoreCase("u")) {
                                if (lineB.equalsIgnoreCase("b")) {
                                    if (check.twoArrsCheck(u, b)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("u")) {
                                    if (check.twoArrsCheck(u, u)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else if (lineB.equalsIgnoreCase("a")) {
                                    if (check.twoArrsCheck(u, a)) {
                                        System.out.println("True");
                                    }
                                    System.out.println("False");
                                } else {
                                    System.out.println("Упс.Щось пішло не так\n");
                                    continue;
                                }
                            } else {
                                System.out.println("Упс.Щось пішло не так\n");
                                continue;
                            }
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
