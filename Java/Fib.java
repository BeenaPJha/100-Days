import java.util.*;
public class Fib {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = 0; //first number
        int b = 1; //second number
        int c=0;

        for(int i =0; i<n; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }

        


      
    }
}
