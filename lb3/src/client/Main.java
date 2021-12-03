package client;

import service.*;

import static service.BadZhegalkin.longZhegalkin;
import static service.Checks.*;


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
        //поліномом Жегалкіна
        System.out.println("Поліномом Жегалкіна:"+longZhegalkin(F)+ "\n");
        //константа 0
        System.out.println("Константа 0:");
        System.out.println(isConst0(F)+"\n");
        //константа 1
        System.out.println("Константа 1:");
        System.out.println(isConst1(F)+"\n");
        //самодвоїста
        System.out.println("Самодвоїста:");
        System.out.println(isSelfDual(F)+"\n");
        //монотонна
        System.out.println("Монотонна:");
        System.out.println(isMonotonous(F)+"\n");
        //лінійна
        System.out.println("Лінійна:");
        System.out.println(isLinear(F));
    }
}
