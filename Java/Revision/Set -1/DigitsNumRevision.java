// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Sample Input
// 6578
// Sample Output
// 6
// 5
// 7
// 8

import java.util.*;

public class DigitsNumRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int count = 0;
        int temp = n;
        int div =0;

        while (n>0)
        {
            // int r = n%10;
            count++;
            // System.out.println(r);
            n = n/10;            
        }

        // System.out.println(count);

        div = (int)Math.pow(10, count-1);
        while(div>0)
        {
            

            int r = temp % div;
            int q = temp/div;
            System.out.println(q);
            temp = r;
            div = div/10;
            // count = count-1;

        }



    }
} 