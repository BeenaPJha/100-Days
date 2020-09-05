import java.util.*;
public class DigitsNum {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = 0;
        int temp = n;
        while(n>0){
            n = n/10;
            d++;
        }

            int divisor = (int)Math.pow(10,d-1);

            while(divisor > 0){

                int q = temp/divisor;
                System.out.println(q);
                temp = temp % divisor;
                divisor = divisor/10;

            }
               
    }
}
