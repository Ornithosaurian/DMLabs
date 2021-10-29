package Service.Tools;

public class Frombitlinetonumbers {

    public int[] fbtlntnumb(int[] bitline, int[] Universum) {

        int outputlength = 0;
        int n = 1;

        for (int i = 0; i < bitline.length; i++) {
            if (bitline[i] == 1) {
                outputlength++;
            }
        }

        int[] output = new int[outputlength];
        n = 0;

        for (int i = 0; i < bitline.length; i++) {
            if (bitline[i] == 1) {
                output[n] = Universum[i];
                n++;
            }
        }
        return output;
    }
}