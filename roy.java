import java.util.*;
import java.lang.Math;

public class roy {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         double a  = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();

         double d = input.nextDouble();

         double first = (c-a)*(c-a);
         double second =  (d-b)*(d-b);

         double summation = first+second;

         double result = Math.sqrt(summation);

         System.out.printf("%.4f\n",result);

         
    }
    
}
