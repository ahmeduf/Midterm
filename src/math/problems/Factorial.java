package math.problems;

import java.util.Iterator;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        int a=5;
        int b=1;
        int c=ahmed(5);
        do {
            b*=a;
            a--;
        }
        while (a>0);
        System.out.println("Factorial value of 5!:"+b); //using Iteration
        System.out.println("Factorial value of 5!:"+c);// using Recursion
    }
    static int ahmed(int n){
        int c;
        if (n==1)
            return 1;
        else {c=(n*ahmed(n-1));}
        return c;

    }

}
