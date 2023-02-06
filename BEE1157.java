import java.util.*;
public class  BEE1157{
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
       char[] c = {'A','v' ,'i','n', 'a', 'n', 'd', 'a' , 'n', ' ', 'R' , 'o' , 'y'};
       String s = new String(c);

       System.out.println(s.indexOf("dan"));
       System.out.println(s.lastIndexOf('n'));
       System.out.println(s.charAt(12));
       System.out.println(s.contains("dan"));

   }
}

