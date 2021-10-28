package Service.LogicalOperations;

public class XOR implements LogicalOperations {
    @Override
    public byte[] doLogicalOperations(int[] a, int[] b) {
        int k = Math.max(a.length, b.length);
        byte[] result = new byte[k];
        int i = 0;
        for (int c : a) {
            result[i] = (byte) (c ^ b[i++]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 1, 1};
        int[] b = {1, 0, 0, 0, 0, 0};
        ContextLogicalOperations contextOperations = new ContextLogicalOperations();
        contextOperations.setLogicalOperations(new XOR());
        System.out.println("Відсортований масив: ");
        for (int num : contextOperations.executeLogicalOperations(a, b)) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

}
