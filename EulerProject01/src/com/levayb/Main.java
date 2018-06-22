package com.levayb;

public class Main {

    public static void main(String[] args) {

        int result = 0;

        for (int a = 1; a < 1000; a++) {
            if ((a % 3 == 0) || (a % 5 == 0)) {
                result += a;
            }
        }
        System.out.println(result);
    }

    private static boolean isDevisiableBy3(int number) {
//        if (number % 3 == 0) {
//            return true;
//        }
//        return false;

        return number % 3 == 0;

        //number % 3 == 0 --> boolean, true false
    }
}

