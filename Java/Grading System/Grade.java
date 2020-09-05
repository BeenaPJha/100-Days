import java.util.*;
public class Grade {
    
    public static void main (String[] args) {

    //     1. You are given as input marks of a student.
    //     2. Display an appropriate message based on the following rules:
  	//   2.1 for marks above 90, print excellent.
  	//   2.2 for marks above 80 and less than equal to 90, print good.
  	//   2.3 for marks above 70 and less than equal to 80, print fair.
  	//   2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	//   2.5 for marks less than equal to 60, print below par.
        System.out.println("Enter Marks");


        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();


        if(input > 90){
            System.out.println("Excellent");
        }
        else if(input >80 && input <=90){
            System.out.println("Good");

        } 
        else if(input >70 && input <=80){
            System.out.println("Fair");
        }
        else if(input >60 && input <=70){
            System.out.println("Meets Expectation");
        }
        else{
            System.out.println("below Par");

        }
        
    }
    
}