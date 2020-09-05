public class Swap {
    
    public static void main (String[] args) {
        

        int a = 40;
        int b = 55;

        System.out.println("a = "+ a +" and b= "+b);

        a = a + b; //40+55= 95
        b = a - b; // 95-55 = 40
        a = a - b; // 95-40 = 55

        System.out.println("Now a = "+ a +" and b= "+b);
        
    }
    
}