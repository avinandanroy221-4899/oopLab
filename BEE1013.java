import java.util.*;

public class BEE1013 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b && a>c )
            System.out.println(a+" eh o maior");

        else if ( b>c && b>a)
            System.out.println(b +" eh o maior");

        else if (c >a && c >b )
            System.out.println(c +" eh o maior");
    }
    
}
