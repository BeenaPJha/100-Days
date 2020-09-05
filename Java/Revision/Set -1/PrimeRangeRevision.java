// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).


//Make it when range is wrong i.e lowNum == highNum

import java.util.*;

public class PrimeRangeRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int count =0;
        int lowNum =  scn.nextInt(); 
        int highNum = scn.nextInt(); 

        if(lowNum == 2 || lowNum == 0 || lowNum==1){
            System.out.println(2);
        }
        if(lowNum==0 || lowNum % 2 ==0){
            lowNum = lowNum+1;
        }

        for(int range = lowNum; range<=highNum; range= range+2)
        {   
            count =0;
            if(range==0 || range==1){
                count+= 1;
                
            }
            else{
                for(int div = 2; div<=Math.sqrt(range); div++)
                {
                    if(range % div == 0)
                    {
                        count++;
                        break;
                    }

                }
            }
            
            if(count == 0){
                System.out.print(range+" ");
            }
        }


    }
} 