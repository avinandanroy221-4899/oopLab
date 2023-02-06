/*
 * Format Specifire--all notes
 */
public class FormatSpecifier {
    public static void main(String[] args) {
        /* 
         * in c programing language we use format specifier
         * now we use format specifier for java programing language
        */

        /*
         * we use to do somethings print "System.out.printf("%d or %f or %c ", variable name );"
         * here we dont use "System.out.println();" function
         */

         //now we take some variable .like as-----

         boolean b = false;
         int i = 10;
         float f = 3.68f;             //for floating number we use "f"all time with floating value 
         String s = "My name is Avinandan Roy";
         double d = 10.2;

         //now print those 

         System.out.printf("%b\n", b);
         System.out.printf("%d\n", i);
         System.out.printf("%.3f\n", f);      //for  \n-------new line 
         System.out.printf("%s\n", s);
         System.out.printf("%.2f\n",d);     //for  .2-----after decimal it goes to two digit
    }
}

/*
 * This is called format specifire
 */
