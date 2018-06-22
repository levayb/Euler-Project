package com.levayb;

public class Main {

    public static void main(String[] args) {
        // The sum of the squares of the first ten natural numbers is,
        //
        //12 + 22 + ... + 102 = 385
        //The square of the sum of the first ten natural numbers is,
        //
        //(1 + 2 + ... + 10)2 = 552 = 3025
        //Hence the difference between the sum of the squares of the first ten natural
        // numbers and the square of the sum is 3025 − 385 = 2640.
        //
        //Find the difference between the sum of the squares of the first one hundred
        // natural numbers and the square of the sum.

        int num = 10;
        int sum = 0;
        int sumSquere = 0;
        int squereSum = 0;

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
        sumSquere = sum * sum;
        System.out.println("1.Squere = " + sumSquere);

        for (int j = 1; j <=10 ; j++) {
            squereSum = squereSum + (j * j);

        }
        System.out.println("2.Squere = " + squereSum);
        System.out.println("The difference is: " + (sumSquere - squereSum));

        int startNumber = 100;
        sum = 0;
        int firstResult = 0;
        int secondResult = 0;

        for (int i = 1; i <= startNumber; i++) {
            sum += i;
        }
        System.out.println("The sum of the first one hundred natural number is: " + sum);
        firstResult = sum * sum;
        System.out.println("The sum of the squares of the first one hundred natural numbers is: " + firstResult);

        for (int i = 1; i <= startNumber ; i++) {
            secondResult += (i*i);
        }
        System.out.println("The square of the sum of the first one hundred natural numbers is: " + secondResult);
        System.out.println("The difference is? " + (firstResult - secondResult));
    }
}
