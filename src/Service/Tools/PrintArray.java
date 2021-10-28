package Service.Tools;

public class PrintArray {
    public void printIntArrayInt(int[] arr) {
        System.out.println("Відсортований масив: \n");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public void printStringArrayArray(String[][] arr) {
        System.out.println("Відсортований масив: \n");
        for (String[] i : arr) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
