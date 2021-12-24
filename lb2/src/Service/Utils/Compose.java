package Service.Utils;

public class Compose {

//    public static void main(String[] args) {
//        int[][] check = cube(new int[][]{{1,0,1,1,0},{1,1,0,0,0},{1,1,0,1,1},{1,1,1,0,1},{1,0,0,0,1}});
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println();
//            for (int j = 0; j < 5; j++) {
//                System.out.print(check[i][j]);
//            }
//        }
//        }

    public  int[][] arrayT(int[][] input){
        int[][] output = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                output[i][j] = input[j][i];
            }
        }

        return output;
    }

    public  int multeveryelem(int[] inp1,int[] inp2){
        int n = 0;

        for (int i = 0; i < 5; i++) {
            n = n + (inp1[i] * inp2[i]);
            //System.out.print(n);
        }
        if (n > 0) {n = 1;}
//        System.out.print(n);
        return n;
    }


    public  int[][] square(int[][] input){

        int[][] transposed = arrayT(input);
        int[][] output = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                output[i][j] = multeveryelem(input[i],transposed[j]);
            }
        }

        return output;
    }
    public  int[][] cube(int[][] input){
        int[][] square = square(input);
        int[][] transposed = arrayT(input);
        int[][] output = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                output[i][j] = multeveryelem(square[i],transposed[j]);
            }
        }

        return output;
    }
}
