import java.util.*;
public class BEE1115{
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      while(true){
         int a = input.nextInt();
         int b = input.nextInt();

         if (a == 0 || b ==0)
            break;
         
         else if (a >0 && b > 0)
            System.out.println("primeiro");

         else if (a > 0 && b < 0)
            System.out.println("quarto");
            
         else if (a < 0 && b < 0)
            System.out.println("terceiro");

         else if (a < 0 && b >0)
            System.out.println("segundo");
      }
      
      
   }
}
