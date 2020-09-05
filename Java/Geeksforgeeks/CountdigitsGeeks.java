//not working for 01123
import java.util.*;
public class CountdigitsGeeks {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
        int r =0;
		
		for(int i=0; i<t; i++)
		{   
            int count=0;
		    int n = scn.nextInt();
			int d = n;
		    while(n>0)
		    {   
		        r = n%10;
                if(r>0 && d%r == 0)
                {
		          count++;  
		        }
		        n = n/10;
		    }
		    System.out.println(count);
		}

    }
}
