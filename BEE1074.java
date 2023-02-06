import java.lang.Math;
import java.util.*;

public class BEE1074 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        //if (n <10000){

        for(int i = 0 ; i < n ; i++){
            int number = input.nextInt();

            if (number > 0){
                if (number % 2 == 0)
                    System.out.println("EVEN POSITIVE");

                else 
                    System.out.println("ODD POSITIVE");
            }

            else if (number < 0){

                if (number %2 == 0)
                    System.out.println("EVEN NEGATIVE");

                else 
                    System.out.println("ODD NEGATIVE");
            }

            else if (number== 0)
                System.out.println("NULL");
        }
   // }

    }
    
}
