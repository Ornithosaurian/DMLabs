package Service.Tools;

public class PrintArray {
    public void printArray(int[] arr){
        System.out.println("Відсортований масив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
