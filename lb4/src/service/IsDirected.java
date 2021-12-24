package service;

public class IsDirected {
    public void isDirected(int[][] matrix) {
        if (symmetry(matrix)) {
            System.out.println("Граф може бути як неорієнтованим, так і орієнтованим\n");
        } else {
            System.out.println("Граф орієнтований\n");
        }
    }

    public boolean symmetry(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0].length != matrix.length) {
            throw new IllegalArgumentException();
        }
        int line = matrix.length;
        for (int l = 0; l < line; l++) {
            for (int p = 0; p < line; p++) {
                if (matrix[l][p] == 1) {
                    if (matrix[l][p] != matrix[p][l]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
