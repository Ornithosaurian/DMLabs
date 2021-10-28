package Service.Tools;

public class Check {

    public boolean twoArrsCheck(int[] arr1, int[] arr2) {

        if (arr2.length < arr1.length) {
            return false;
        }

        int temp;
        int n = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < (arr2.length - n); j++) {
                if (arr1[i] == arr2[j]) {
                    temp = arr2[arr2.length - 1 - n];
                    arr2[arr2.length - 1 - n] = arr2[j];
                    arr2[j] = temp;
                    n++;
                    break;
                } else if (j == (arr2.length - 1 - n)) {
                    return false;
                }

            }
        }
        return true;
    }
}