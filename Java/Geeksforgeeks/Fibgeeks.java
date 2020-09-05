import java.util.*;
public class Fibgeeks {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
       
        int c=0;
        
        for(int j=0;j<t;j++)
        {   
            int a = 1; //first number
            int b = 1; //second number
            int n = scn.nextInt();
            for(int i =0; i<n; i++){
                System.out.println(a);
                c = a+b;
                a = b;
                b = c;  
            }
        }


        


      
    }
}
