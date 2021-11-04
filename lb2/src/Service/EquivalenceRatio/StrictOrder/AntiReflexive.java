package Service.EquivalenceRatio.StrictOrder;

public class AntiReflexive implements StrictOrder {
    @Override
    public boolean doStrictEquivalence(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException();
        }
        int line = matrix.length;
        int pillar = matrix[0].length;
        int count = 0;
        if (line < pillar) {
            for (int st = 0; st < line; st++) {
                if (matrix[st][st] == 0) {
                    count++;
                }
            }
        } else {
            for (int st = 0; st < pillar; st++) {
                if (matrix[st][st] == 0) {
                    count++;
                }
            }
        }
        return count == line;
    }
}
