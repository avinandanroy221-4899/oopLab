import java.util.*;
public class BEE1014{
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int distance = input.nextInt();
      float time = input.nextFloat();

      float total = distance/time;

      System.out.printf("%.3f km/l\n",total);
      
   }
}