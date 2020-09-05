import java.util.*;
public class Primegeeksoptimized {
    
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("enter testcases");
        int t = scn.nextInt();

        for(int i=0; i<t; i++){
            // System.out.println("enter low");
            int low = scn.nextInt();
            // System.out.println("enter high");
            int high = scn.nextInt();
           

            if (low == 0 || low == 0 || low == 1){
                System.out.print(2+" ");
            }
            if(low % 2 == 0)
            {
                low = low + 1;
            }
            for(int j = low; j <= high; j=j+2)
            { 
                int count = 0;
                
                if (j == 0 || j==1){
                    //not prime
                    count = count+1;
                }
                else
                {
                    for(int div=2; div<=Math.sqrt(j); div++)
                    {
                        if( j % div == 0)
                        {
                            count = count + 1;
                            break;                        
                        }
                    }

                }
                if(count == 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();


        }
    }
}