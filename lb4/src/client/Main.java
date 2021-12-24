package client;

import service.IsDirected;
import service.PostOrder;

public class Main {
    public static void main(String[] args) {
        IsDirected isDir = new IsDirected();
       // PostOrder.BinaryTree tree = new PostOrder.BinaryTree();

        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0,0,1,0,0},
                {1,0,0,1,1},
                {0,1,0,0,1}
        };
        isDir.isDirected(matrix);

        // tree.printPostorder();
    }
}
