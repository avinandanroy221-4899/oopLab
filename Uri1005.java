import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double MEDIA = (a*3.5+b*7.5)/(3.5+7.5);

        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
    
}
