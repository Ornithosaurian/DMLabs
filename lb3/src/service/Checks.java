package service;

import java.util.Objects;

public class Checks {
    public static void main(String[] args) {
        System.out.println(isConst0(new String[]{"0","0","1","1","0","0","1","1"}));
        System.out.println(isConst1(new String[]{"0","0","1","1","0","0","1","1"}));
        System.out.println(isSelfDual(new String[]{"0","0","1","1","0","0","1","0"}));
        System.out.println(isMonotonous(new String[]{"0","0","1","1","0","0","1","1"}));
    }

    public static boolean isConst0(String[] input) {
        return Objects.equals(input[0], "0");
    }

    public static boolean isConst1(String[] input) {
        return Objects.equals(input[7], "1");
    }

    public static boolean isSelfDual(String[] input) {
        return !Objects.equals(input[0], input[7]) && !Objects.equals(input[1], input[6]) &&
                !Objects.equals(input[2], input[5]) && !Objects.equals(input[3], input[4]);
    }
    public static boolean isMonotonous(String[] input) {

        if(Objects.equals(input[0], "1")){
            for (int i = 1; i < 8; i++) {
                if(Objects.equals(input[i], "0")){
                    return false;
                }
            }
        }

        if (Objects.equals(input[1], "1") || Objects.equals(input[2], "1") ||
                Objects.equals(input[3], "1") ||
                Objects.equals(input[4], "1") || Objects.equals(input[5], "1") ||
                Objects.equals(input[6], "1")){
            if (Objects.equals(input[7], "0"))return false;
        }

        return true;
    }
    public static boolean isLinear(int input){
        if(input > 1){
            return false;
        }

        return true;
    }


}
