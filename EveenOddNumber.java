//Author : Avinandan Roy

import java.util.*;

public class EveenOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("This is even number");

        else 
            System.out.println("This is odd number");
    }
}

