package client;

import service.*;

public class Main {
    public static void main(String[] args) {
        IsDirected isDir = new IsDirected();

        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 0, 1}
        };
        isDir.isDirected(matrix);
        System.out.println("Прямий обхід дерева:");
        TreePart l2 = new TreePart(24);
        TreePart l1r1 = new TreePart(3);
        TreePart r1l1 = new TreePart(6);
        TreePart r4 = new TreePart(4);
        TreePart r3l1 = new TreePart(5);
        TreePart r2l1 = new TreePart(2);
        TreePart r3 = new TreePart('-', r3l1, r4);
        TreePart r2 = new TreePart('*', r2l1, r3);
        TreePart r1 = new TreePart('^', r1l1, r2);
        TreePart l1 = new TreePart('*', l2, l1r1);
        TreePart root = new TreePart('/', l1, r1);

        StringBuilder IO = Tree.treeTraversal(root);
        System.out.println(IO);
        Tree.calculatePoland(IO);
        System.out.println();

        System.out.println("Зворотній обхід дерева:");
        TreePart Rl2 = new TreePart(24);
        TreePart Rl1r1 = new TreePart(3);
        TreePart Rr1l1 = new TreePart(6);
        TreePart Rr4 = new TreePart(4);
        TreePart Rr3l1 = new TreePart(5);
        TreePart Rr2l1 = new TreePart(2);
        TreePart Rr3 = new TreePart('-',Rr3l1,Rr4);
        TreePart Rr2 = new TreePart('*',Rr2l1,Rr3);
        TreePart Rr1 = new TreePart('^',Rr1l1,Rr2);
        TreePart Rl1 = new TreePart('*',Rl2,Rl1r1);
        TreePart Rroot = new TreePart('/',Rl1,Rr1);

        StringBuilder RIO = ReversalTreeTraversal.reversalTreeTraversal(Rroot);
        System.out.println(RIO);
        ReversalTreeTraversal.calculateReversePoland(RIO);

    }

}
