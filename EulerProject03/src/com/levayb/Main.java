package com.levayb;

public class Main {

    // The prime factors of 13195 are 5, 7, 13 and 29.
    // What is the largest prime factor of the number 600851475143 ?

    public static void main(String[] args) {
        long faktor = 0;
        long lookingNum = 600851475143L;
        long foxiMaxi = 0;
        while (lookingNum > 1) {
            for (faktor = 2; faktor <= lookingNum; faktor++) {
                if (lookingNum % faktor == 0 && isPrime(faktor)) {
                    System.out.println(faktor);
                    lookingNum = lookingNum / faktor;
                    if (foxiMaxi < faktor) {
                        foxiMaxi = faktor;


                    }
                }
            }
        }
        System.out.println(foxiMaxi);

    }

    // public static int összeadás(int elsőszám, int másodikszám) {
    //     int eredmény = elsőszám + másodikszám;
    //     return  eredmény;
    // }

    public static boolean isPrime(long number) {

        if (number == 2) {
            return true;
        }
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 3; i < (number / 2); i = i + 2) {


            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
