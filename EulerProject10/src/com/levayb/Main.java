package com.levayb;

public class Main {

    public static void main(String[] args) {
	// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        //
        //Find the sum of all the primes below two million.

        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(long number) {

        if (number == 2) {
            return true;
        }
        if (number == 0 || number == 1 || number % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
