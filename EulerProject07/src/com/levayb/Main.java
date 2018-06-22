package com.levayb;

public class Main {

    public static void main(String[] args) {
        // By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        //
        //What is the 10 001st prime number?
        int counter = 0;
        long result = 0;
        for (int i = 2; i > 0; i++) {
            if (isPrime(i)) {
                counter++;
                if (counter == 10001) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int number) {

        if (number == 2) {
            return true;
        }
        if (number == 0 || number == 1 || number % 2 == 0) {
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
