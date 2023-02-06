import java.util.Scanner;

public class assignment3 {


/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
 * step 5: print the variables
 *
*/

public static void main(String[] args) {       /*create a main method */
    
    Scanner input = new Scanner(System.in);

    /*
     * .........first take input........
    */
    
    int id = input.nextInt();
    String title = input.nextLine();
    int price = input.nextInt();
    String description = input.nextLine();
    String category = input.nextLine();


    /*
     * .........now print them ......
    */

    System.out.println("ID : "+id);
    System.out.println("Title : "+title);
    System.out.println("Price : "+price);
    System.out.println("Description : "+description);
    System.out.println("Category : "+category);

    //..........end.........

}
    
}
