package Service.LogicalOperations;


public class NOT { /*//implements LogicalOperations {*/
//            public static void main(String[] args) {
//                        int[] arr;
//
//              arr =  doLogicalOperations(new int[]{1,1,1},new int[]{1,0,1});
//
//                        for (int i: arr) {
//            System.out.print(i);
//        }
//}
        public int[] doLogicalOperations(int[] a, int[] b) {

    int[] resultNOT = new int[a.length];

        for(int i = 0; i < a.length; i++){
            if (a[i]==b[i])
                resultNOT[i] = 0;
            else{
                resultNOT[i] = 1;
            }
        }

        return resultNOT;
    }
}
