package service;

import java.util.Objects;

public class BadZhegalkin {
    public static void main(String[] args) {
        System.out.println(longZhegalkin(new String[]{"0","0","1","1","0","0","1","1",}));
    }

    public static String[] findPolinom(String[] input) {
        String[] a1 = new String[7];
        String[] a2 = new String[6];
        String[] a3 = new String[5];
        String[] a4 = new String[4];
        String[] a5 = new String[3];
        String[] a6 = new String[2];
        String[] a7 = new String[1];
        String[] arr = new String[8];

        for (int i = 1; i < 8; i++) {
            if(!Objects.equals(input[i - 1], input[i])){
                 a1[i-1] = "1";
            }else {a1[i-1] = "0";}
        }
        for (int i = 1; i < 7; i++) {
            if(!Objects.equals(a1[i - 1], a1[i])){
                a2[i-1] = "1";
            }else {a2[i-1] = "0";}
        }
        for (int i = 1; i < 6; i++) {
            if(!Objects.equals(a2[i - 1], a2[i])){
                a3[i-1] = "1";
            }else {a3[i-1] = "0";}
        }

        for (int i = 1; i < 5; i++) {
            if(!Objects.equals(a3[i - 1], a3[i])){
                a4[i-1] = "1";
            }else {a4[i-1] = "0";}
        }
        for (int i = 1; i < 4; i++) {
            if(!Objects.equals(a4[i - 1], a4[i])){
                a5[i-1] = "1";
            }else {a5[i-1] = "0";}
        }
        for (int i = 1; i < 3; i++) {
            if(!Objects.equals(a5[i - 1], a5[i])){
                a6[i-1] = "1";
            }else {a6[i-1] = "0";}
        }
        for (int i = 1; i < 2; i++) {
            if(!a6[i - 1].equals(a6[i])){
                a7[i-1] = "1";
            }else {a7[i-1] = "0";}
        }

        arr[0] = input[0];
        arr[1] = a1[0];
        arr[2] = a2[0];
        arr[3] = a3[0];
        arr[4] = a4[0];
        arr[5] = a5[0];
        arr[6] = a6[0];
        arr[7] = a7[0];

        return arr;
    }

    public static String longZhegalkin(String[] input) {
        String[] Zhegalked = findPolinom(input);
        String output = "";

        if(Objects.equals(Zhegalked[0], "1")){
            output="1";
        }
        if(Objects.equals(Zhegalked[1], "1")){
            output=output + "+ z ";
        }
        if(Objects.equals(Zhegalked[2], "1")){
            output=output + "+ y ";
        }
        if(Objects.equals(Zhegalked[3], "1")){
            output=output + "+ yz ";
        }
        if(Objects.equals(Zhegalked[4], "1")){
            output=output + "+ x ";
        }
        if(Objects.equals(Zhegalked[5], "1")){
            output=output + "+ xz ";
        }
        if(Objects.equals(Zhegalked[6], "1")){
            output=output + "+ xy ";
        }
        if(Objects.equals(Zhegalked[7], "1")){
            output=output + "+ xyz ";
        }
        if(!Objects.equals(Zhegalked[0], "1")){
          output =  output.substring(1);;
        }
        return output;
    }
}
