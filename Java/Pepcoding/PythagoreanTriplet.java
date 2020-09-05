import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args){

       Scanner scn = new Scanner(System.in);
       int a= scn.nextInt();
       int b = scn.nextInt();
       int c = scn.nextInt();

       a = a*a;
       b = b*b;
       c = c*c;
       if( (a==(b+c)) ||(b==(a+c)) || (c==(a+b))){
          System.out.println(true);  
       }
      
        else{
            System.out.println(false);
        }
       


      
        

    }
}
