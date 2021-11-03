package Service.EquivalenceRatio;

public class Reflexive implements EquivalenceRatio {
    @Override
    public boolean doEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException();
        }
        int line = matrix.length;
        int pillar = matrix[0].length;
        int count = 0;
        if (line < pillar) {
            for (int st = 0; st < line; st++) {
                if (matrix[st][st] == 1) {
                    count++;
                }
            }
            return count == line;
        } else {
            for (int st = 0; st < pillar; st++) {
                if (matrix[st][st] == 1) {
                    count++;
                }
            }
            return count == line;
        }
    }
}
