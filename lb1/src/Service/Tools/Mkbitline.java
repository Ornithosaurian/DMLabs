package Service.Tools;
public class Mkbitline {

    public  int[] mkbitline(int[] futurebitline, int[] Universum) {

        int[] bitline01 = new int[Universum.length];

        for (int i = 0; i < Universum.length; i++) {
            for (int j = 0; j < (futurebitline.length); j++) {
                if (Universum[i] == futurebitline[j]) {
                    bitline01[i] = 1;
                    break;
                } else if (j == (futurebitline.length - 1)) {
                    bitline01[i] = 0;
                }
            }
        }
        return bitline01;
    }
}