// 1) Swap 2 numbers without using third variable.
import java.util.*;

public class SwapRevision {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        int firstNum = scn.nextInt();
        int secNum = scn.nextInt();

        firstNum = firstNum + secNum;
        secNum = firstNum - secNum;
        firstNum = firstNum - secNum;
        System.out.println(firstNum+","+secNum);

    }
} 