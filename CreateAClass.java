import java.util.*;

public class CreateAClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*int[] roll =  new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];*/

        

        
        //just declaring 

        //Student kunal ;

        //kunal = new Student();

        Student kunal = new Student();

        /*kunal.roll =13;
        kunal.name ="kunal roy";
        kunal.marks = 34.48f;               */

  /*      System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        
        */ 
        

        kunal.greeting();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        Student avinandan = new Student();

        avinandan.my_information();

        father_information krishna = new father_information();

        System.out.println("\n\n\n\n");

        krishna.fatherNameOrInformatoion();
     
    }
}

// for every single student 
class Student{
    int roll;
    String name ;
    float marks  ; 

    void my_information(){

        System.out.println("Name : avinandan Roy \n Student Id : 221-15-4899 \n University : Daffodil International University \n CGPA : #.68 \n Bat ch : 221 \n");
    }

    //we need a way to add the values of the above 
    //properties object by object
    //we need one word to access every object

    void greeting(){
        System.out.println("Name = kunal singha roy \n id : 221-15-4899 \n university : daffodil international university \n deoartment : computer svience & engineering . \n Home towm : lohagara,narail, dhaka , bangladesh ");
    }

    Student(){
        this.roll =13;
        this.name ="kunal roy";
        this.marks = 34.48f; 
    }

    void changename(){
        name = newname;
    }
    
}
class father_information
{

    void fatherNameOrInformatoion (){
    System.out.println("Name : Krishna kanto Roy \n Son name : Avinandan roy \n Occupation : Dead Writter \n Home Town : Lohagara ,narail, dhaka ,bangladesh");
}

}
