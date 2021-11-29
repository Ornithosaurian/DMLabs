package client;

import service.*;

public class Main {
    public static void main(String[] args) {
        Duality duality = new Duality();
        BooleanFunctionRepresentation booleanFunction = new BooleanFunctionRepresentation();
        PrintTruthTable printTruthTable = new PrintTruthTable();
        String[] x = "00001111".split("");
        String[] y = "00110011".split("");
        String[] z = "01010101".split("");
        String[] F = "00000110".split("");
        //Таблиця істеностей
        System.out.println("Таблиця істеностей:");
        printTruthTable.printTable(x,y,z,F);
        System.out.println();
        //Двоїста функція
        System.out.println("Двоїста функція:");
        for(String s: duality.findDuality(F)){
            System.out.println(s);
        }
        System.out.println();
        //ДДНФ
        booleanFunction.printPDNF(x,y,z,F);
        System.out.println();
        //ДКНФ
        booleanFunction.printPCNF(x,y,z,F);
        System.out.println();
    }
}
