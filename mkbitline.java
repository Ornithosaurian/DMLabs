public class mkbitline {

//    public static void main(String[] args) {
//
//        int[] arr;
//        arr = mkbitline(new int[]{1,2,3},new int[]{1,5,2,3});
//        for (int i: arr) {
//            System.out.print(i);
//        }
//    }


    public static int[] mkbitline(int[] futurebitline, int[] Universum){

        int bitline01[] = new int[Universum.length];

        for (int i = 0;i < Universum.length;i++) {

            for (int j = 0;j < (futurebitline.length);j++) {
                if (Universum[i] == futurebitline[j]){
                    bitline01[i] = 1;
                    break;
                }else if (j == (futurebitline.length - 1)){
                    bitline01[i] = 0;
                }

            }
        }
        return bitline01;
    }
}