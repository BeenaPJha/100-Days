import java.util.*;
public class Reverseleet {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        long temp = 0;
        int count=0;
        int n=x;
        int newx=x;
        int d=0;
        if(x<0){
            x=x*(-1);
            n=x;
        }
        while(x>0)  
        {
            d=x%10;
            count++;
            x=x/10;
            
            
        }
        // System.out.println(x);
        while(count>0){
            long mul = (long)Math.pow(10, count-1);
            // count = count -1;
            int r = n%10;
            temp+= r*mul;
            n=n/10;
            count = count -1;
        }
            if(newx<0){
              temp = temp*(-1);  
            }
        else{
            temp =temp;
        }
        
        if((temp<Integer.MIN_VALUE ) || temp>Integer.MAX_VALUE){
            temp = 0;
            // Integer.MIN_VALUE is -2**31 and Integer.MAX_VALUE is ((2**31)-1)
            
        }
        
        System.out.println((int)temp);
    }
}
