import java.util.*;

class summation {
   int a , b, c, d, e;

   int sum(){
      return a+b+c+d+e;
   }
}

class demoApplication{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = input.nextInt();

      for (int i = 0 ; i < number ; i++){
         summation mySummation = new summation();
         mySummation.a = input.nextInt();
         mySummation. b = input.nextInt();
         mySummation. c = input.nextInt();
         mySummation. d = input.nextInt();
         mySummation. e = input.nextInt();

         int result = mySummation.sum();

         System.out.println(result +"\n\n\n");
      }
   }
}