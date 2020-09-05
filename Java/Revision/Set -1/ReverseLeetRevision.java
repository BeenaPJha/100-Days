// Given a 32-bit signed integer, reverse digits of an integer.

// Example 1: Input: 123  Output: 321 
// Example 2: Input: -123 Output: -321
// Example 3: Input: 120 Output: 21

// Note:
// Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

import java.util.*;

public class ReverseLeetRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int temp = n, newtemp =n;
        long ans = 0;

        if (n<0){
            n = n*(-1);
            temp = n;
    //    System.out.println(temp);

        }
       
       while(temp>0)
       {
           int r = temp%10;
           ans = r + (ans*10);
           temp = temp/10;
       }

       if(newtemp<0){
           ans = ans*(-1);
        
       }
       else{
           ans = ans;
       }
       
       if((ans<Integer.MIN_VALUE ) || (ans>Integer.MAX_VALUE)){
           ans = 0;
       }
       System.out.println(ans);

        

    }
} 