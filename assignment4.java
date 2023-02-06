
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age>= 18)
            System.out.println("Valid voter");

        else 
            System.out.println("Invalid votter");
    }
}
