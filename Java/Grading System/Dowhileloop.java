import java.util.*;
public class Dowhileloop {
    
    public static void main (String[] args) {

        // Do While example

        // int i =11;
        // do {
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=10);

        // While example

        //  int i = 1;
        //     while(i <= 10)
        //     {
        //         System.out.println(i);
        //         i++;
        //     }
        
        // Post and preincrement example

            int i = 10, j = 20;
            // int y,z;
            // y = i++;
            //     System.out.println("y = "+y +" and i ="+i);
            // z=++i;
            //     System.out.println("z = "+z +" and i ="+i);

            if(i++ == i){
                System.out.println(i+" is good");
                 
            }
            else{
                System.out.println(i+" is bad");
            }

            if(++j == j){
                  System.out.println(j+" is good");
                 
            }
            else{
                System.out.println(j+" is bad");
            }
        // for loop example

            // for( ;i <= 10; ){
            //     System.out.println(i);
            //     i++;
            // }
      
    }
    
}