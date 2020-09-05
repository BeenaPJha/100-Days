// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.*;
public class Prime {
    
    public static void main (String[] args) {
       Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		int i=0;
		int c = 0;
		while(i<t){
		    int n = scn.nextInt();
            c=0;
		    if(n<=1){
		        System.out.println("No");
		    }
		    else if(n==2){
		        System.out.println("Yes");
		    }
		    else{
        		    for(int j=2; j<= Math.sqrt(n);)
        		    {
        		        if(n%j == 0)
        		        {
        		            System.out.println("No");
        		            c=1;
        		            break;
        		        }
        		        else{
        		            j++;
        		        }
        		    }
		    
        		    if(c==0){
        		        System.out.println("Yes");
        		    }
		    }
		    
		    
		    i++;
		}


    }
}