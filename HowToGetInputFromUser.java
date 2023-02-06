/*
 *There are only one person who exists this world .He is only God.


 * How i get input from user in java .
 * here we can see this .....
 */


import java.util.Scanner;       //for get input from user we get it first 

public class HowToGetInputFromUser{             //start

    public static void main(String[] args) {

        /*
         * now i take function that can help me to get input from user
         * this function is ::::   Scanner input = new Scanner(System.in); 
         *                                 we use this tine bellow 
         */
        
        Scanner input = new Scanner(System.in);                


        /*
         * now i take like as int , float ,double,string.........
         * .........some input term..............
         * for int-----------    int a = input.nextint();
         * for double ---------  float f = input.nextfloat();
         * for string----------- String s = input.nextLine();
         * 
         * 
         * there are one example in beloow ...we talk about this ..
         */

         String s = input.nextLine();   //to get a input as a string we use "nextLine()";
         System.out.println(s);

         /*
          * from this we can get input and also print a output ..
          */

    }

}
