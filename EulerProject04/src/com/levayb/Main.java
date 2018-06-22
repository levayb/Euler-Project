package com.levayb;

public class Main {

    public static void main(String[] args) {
        // A palindromic number reads the same both ways.
        // The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        //
        //Find the largest palindrome made from the product of two 3-

        int product = 1;
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int x = 100; x < 1000; x++) {
                product = i * x;
                if (isPalindrome(Integer.toString(product))) {
                    System.out.println(product);

                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        System.out.println("Greatest palindrome is: " + max);

    }

    public static boolean isPalindrome(String s) {
        String string = "";
        for (int i = s.length() -1; i >= 0; i--){
            string += s.charAt(i);
        }
        if (s.equals(string)) {
            return true;
        }
        return false;
    }
}

