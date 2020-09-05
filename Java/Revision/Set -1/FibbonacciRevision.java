// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

//Sample I/P: 10 
//Sample O/P: 0 1 1 2 3 5 8 13 21 34


import java.util.*;

public class FibbonacciRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int first = 0;
        int sec = 1;
        int third = 0;

        
        for(int i=1; i<n; i++)
        {
            System.out.print(first+" ");
            third = first + sec;
            first = sec;
            sec = third;
            

        }

    }
} 