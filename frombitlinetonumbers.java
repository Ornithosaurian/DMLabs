public class frombitlinetonumbers {

//    public static void main(String[] args) {
//
//        int[] arr;
//        arr = fbtlntnumb(new int[]{0,1,0},new int[]{1,5,2,3});
//        for (int i: arr) {
//            System.out.print(i);
//        }
//    }


    public static int[] fbtlntnumb(int[] bitline, int[] Universum){

        int outputlength = 0;
        int n = 1;

        for (int i = 0; i < bitline.length; i++) {
            if (bitline[i] == 1) {outputlength++;};
        }

        int[] output = new int[outputlength];
        n = 0;

        for (int i = 0; i < bitline.length; i++) {
            if (bitline[i] == 1){
            output[n] = Universum[i];
            n++;
            }
        }
    return output;
    }
}