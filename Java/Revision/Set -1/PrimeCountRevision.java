// Count the number of prime numbers less than a non-negative number, n.

// Example:

// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

import java.util.*;

public class PrimeCountRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int lowNum = 3;
        int primeCount = 1; // for 2 since it is prime number and lownumber we kept as 3
        int count = 0;

        if(n == 0 || n==1 || n==2){
            System.out.println(0);
        }

        for(int i= lowNum; i<n; i=i+2)
        {   
            count = 0;
            for(int div=2; div<=Math.sqrt(i); div++)
            {
                if(i%div == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0){
                primeCount++;
                
            }
        }
        System.out.println(primeCount);

        

    }
} 