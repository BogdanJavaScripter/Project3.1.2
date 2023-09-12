import java.util.Scanner;
import java.sql.SQLOutput;
public class part3 {
    public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);
        System.out.println("Hello if you here you might wanna advice ");
        System.out.println("Am a book guy ho can give you a few interesting books ");
        System.out.println("Type you age ");
        int age = KeyBoard.nextInt();
        if (age <= 6) {
            System.out.println("Book find");
            System.out.println("Trinite The history of the creation of the nuclear bomb.");
        } else if (age <= 13 && age >= 16) {
            System.out.println("Book find");
            System.out.println("Superstrings and the Search for the Theory of Everything 1st Edition .");
        } else if (age <= 17 && age >= 25) {
            System.out.println("Book not found");
            System.out.println("You at university you dont have time to read bye.");
        } else if (age <= 30 && age >= 50) {
            System.out.println("Book find");
            System.out.println("That will be such a nice lesson for you Atomic habits");
        } else {
            System.out.println(" You have already reached the state of bliss and genius");
            System.out.println("I will tell you some book after I beat my grandfather in chess");
        }

    }

}

