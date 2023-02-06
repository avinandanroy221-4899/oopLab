import java.lang.Math;
import java.util.Scanner;

public class BEE1041 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();

        if (a > 0 && b > 0)
            System.out.println("Q1");

        else if (a < 0 && b > 0)
            System.out.println("Q2");

        else if (a < 0 && b < 0)
            System.out.println("Q3");

        else if (a> 0 && b < 0)
            System.out.println("Q4");

        else if ( a == 0 && b == 0)
            System.out.println("Origem");

        else if ( a > 0|| a<0 && b ==0)
            System.out.println("Eixo X");

        else if (a ==0 && b <0 || b >0)
            System.out.println("Eixo Y");
    }
    
}
