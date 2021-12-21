package client;

import service.IsDirected;

public class Main {
    public static void main(String[] args) {
        IsDirected isDir = new IsDirected();
        int[][] matrix = {{1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0,0,1,0,0},
                {1,0,0,1,1},
                {0,1,0,0,1}};
        isDir.isDirected(matrix);
    }
}
