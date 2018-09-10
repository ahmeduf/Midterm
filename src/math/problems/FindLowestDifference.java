package math.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLowestDifference {



    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int m = array1.length;
        int n = array2.length;

        System.out.println(difference(array1,array2,m,n));

    }

    private static int difference(int a1[], int a2[], int m, int n)
    {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int a = 0, b = 0;

        int c = Integer.MAX_VALUE;

        while (a < m && b < n)
        {
            if (Math.abs(a1[a] - a2[b]) < c)
                c = Math.abs(a1[a] - a2[b]);

            if (a1[a] < a2[b])
                a++;

            else
                b++;
        }

        return c;


    }

}
