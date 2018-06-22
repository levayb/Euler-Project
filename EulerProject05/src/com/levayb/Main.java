package com.levayb;

public class Main {

    public static void main(String[] args) {

	// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        //
        //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

        int c = 21;
        while (1==1)
        {
            boolean all = true;
            for (int i = 1; i < 21; i++)
            {
                if ( c % i != 0 )
                {
                    all = false;
                    break;
                }
            }
            if ( all )
            {
                System.out.println( c );
                System.exit(0);
            }

            c++;
        }
    }
}
