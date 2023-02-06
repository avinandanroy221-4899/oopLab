/*
 * Author : Avinandan Roy
 */

import java.util.*;

public class VowelOrConsonant {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);

        if (ch == 'a' || ch =='A' && ch == 'e' || ch == 'E' && ch =='i' || ch == 'I' && ch == 'o' || ch == 'O' && ch == 'u' || ch == 'U' )
            System.out.println("This is vowel");

        else 
            System.out.println("This is constant");
    }
}
