import java.util.*;
public class Fibbonacci {
    
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int t =  scn.nextInt();

        
        

        for(int i=0; i<t; i++){
            int third = 0;int first = 0;
        int sec = 1;
            int n = scn.nextInt();
            for(int j=0; j<n; j++)
            {
                System.out.print(first+" ");
                third = first + sec;
                first = sec;
                sec = third;
            }
            System.out.println();
        }
    }
}