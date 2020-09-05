// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.*;

public class PrimeRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in); // for taking user input need to write this

        int t = scn.nextInt(); // The number of testcases which user will enter
        
        //Below for loop is for the test cases till which we want the calculations to be repeated
        for(int i=1; i<=t; i++){
            
            int count = 0;
            int n = scn.nextInt(); //for taking the numbers from user till the test case count is reached
            
            if(n==0||n==1){
                System.out.println("Not a prime number");
            }
            else
            {
                for(int div=2; div<=Math.sqrt(n);div++)
                {   
                    if(n%div == 0)
                    {
                        System.out.println("Not a prime number");
                        count++;
                        break;
                    }
                    
                }
                if(count==0)
                {
                    System.out.println("prime number");

                }
            }
            

        }
        

    }
} 