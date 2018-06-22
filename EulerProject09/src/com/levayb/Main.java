package com.levayb;

public class Main {

    public static void main(String[] args) {

        // A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        //
        //a2 + b2 = c2
        //For example, 32 + 42 = 9 + 16 = 25 = 52.
        //
        //There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        //Find the product abc.

        for (int i = 1; i < 500; i++) {
            for (int j = 1; j < 500; j++) {
                for (int k = 1; k < 1000; k++) {
                    if (i + j + k == 1000) {
                        if (isPythagorean(i, j, k)) {
                            System.out.println("Pitagorasz számsor: " + i + "^2 + " + j + "^2 = " + k +"^2 ");
                            System.out.println("a + b + c = " + (i + j + k));
                            System.out.println("Az eredmény: " + (i * j * k));
                            return;
                        }
                    }
                }
            }
        }
    }

    public static boolean isPythagorean(int firstNum, int secondNum, int thirdNum) {
        return (firstNum * firstNum) + (secondNum * secondNum) == (thirdNum * thirdNum);
    }
}