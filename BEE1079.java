import java.lang.Math;
import java.util.*;

public class BEE1079 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int i;
            int n = input.nextInt();
            
                for( i = 0 ; i < n ; i ++){

                    float a = input.nextFloat();
                    float b = input.nextFloat();
                    float c = input.nextFloat();     
    
                    float avg = (a*2+b*3+c*5)/(2+3+5);
                    System.out.printf("%.1f\n",avg);

                }
 
    }
    
}