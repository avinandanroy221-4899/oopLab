import java.util.*;

public class practicess {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a==b)
            System.out.println(a+" and "+b+" is equal");

        else{
            if(a>b){
                System.out.println(a +" is greater than ."+b);
            }

            else
                System.out.println(b+" is graeter than "+a);
        }

    }
}
