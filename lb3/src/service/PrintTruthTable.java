package service;

public class PrintTruthTable {
    public void printTable(String[] x, String[] y, String[] z, String[] F) {
        System.out.println("x" + "  y" + "  z" + "  F");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  " + y[i] + "  " + z[i] + "  " + F[i]);
            System.out.println();
        }
    }
}
