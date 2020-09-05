import java.util.*;
public class NprimeNum {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int lowNum = scn.nextInt();
        int count=0;
        int highNum = scn.nextInt();
        int primeCount = 0;


        for(int i=lowNum; i<=highNum; i++)
        {
            count = 0;
            for( int div = 2 ; div<= Math.sqrt(i); div++)
            {
                if(i % div == 0)
                {
                    count =1;
                    break;
                }
            }
            if (count==0)
            {
                primeCount++;
                // System.out.println(+i);
            }
        }

        


      
    }
}
