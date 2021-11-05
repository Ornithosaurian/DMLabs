package Service.Utils;

public class PrintArray {
    public void printIntArrayInt(int[] arr) {
        System.out.println("Масив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public void printIntArray(int[][] arr){
        System.out.println("Масив: \n");
        for(int[] l:arr){
            for(int p:l){
                System.out.print(p+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printStringArrayArray(String[][] arr) {
        System.out.println("Масив: \n");
        for (String[] i : arr) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
