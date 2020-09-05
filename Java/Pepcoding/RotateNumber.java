import java.util.*;
public class RotateNumber {
    public static void main(String[] args){

       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int k = scn.nextInt();
       int temp = n;
       int count = 0, rotatedVal=0, r=0, q=0, ans=0;

       while(temp>0){
           temp = temp/10;
           count++;
       }      
    
        for(int i=0; i<k; i++){
            // while(n>0){
                r = n%10;
                int mul = (int)Math.pow(10,(count-k));
                rotatedVal += (r*mul);
                q = n/10;
                n=n/10;  
                count++;
            // }
        }
            System.out.println(q);
            ans+= rotatedVal+q;
            System.out.println(ans);
    }
}
