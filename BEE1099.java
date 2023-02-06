import java.util.*;
public class BEE1099{
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int x,y;

      int i ; 
      for(i = 0 ; i < n ;i++){
         x = input.nextInt();
         y = input.nextInt();
         int sum = 0;

         if (x< y){
            for(int j = x+1 ; j<y ; j++){
               if(j%2 != 0){
                  sum += j;
                 
               }
            }
            System.out.println(sum);
         }

         else if (x > y ){
            for( int j =y+1 ; j <x ; j++){
               if (j%2 != 0){
                  sum += j;
               }
            }
            System.out.println(sum);
         }
         else if (x ==y){
            System.out.println("0");
         }
      }
      
}
}