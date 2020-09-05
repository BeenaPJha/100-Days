import java.util.*;
public class Countdigits {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = 0;
        while(n>0){
            n = n/10;
            // System.out.println("Q = "+n);
            // n = n%10;
            // System.out.println("R = "+n);
            d++;
        }
            System.out.println(d);

    }
}
