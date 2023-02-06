import java.lang.Math;
import java.util.*;

public class BEE1116 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() ;
        
        for( int i =0 ; i < n ; i++ ){
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            if (number2 == 0)
                System.out.print("divisao impossivel\n");
                else
                    System.out.println((float)number1/(float)number2);
        
        }

        
    }
    
}
