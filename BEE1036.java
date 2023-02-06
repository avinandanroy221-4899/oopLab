import java.lang.Math;
import java.util.Scanner;

public class BEE1036 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double t,r1,r2;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (((b*b)-4*a*c)<0 ||a==0){
            System.out.println("Impossivel calcular");
        }

        else {

            double m = (b*b)-4*a*c;
            t = Math.sqrt(m);
            r1 = (-b+t)/2*a;
            r2 = (-b - t)/2 * a;

            System.out.printf("%.5f\n",r1);
            System.out.printf("%.5f\n",r2);

        }
    }
    
}
