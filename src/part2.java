import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);


        System.out.print("Hello, how old are you? ");
        int age = KeyBoard.nextInt();


        if (age < 6) {
            System.out.println("go to kindergarten and dont forget to off computer .");
        } else if (age > 7 && age <= 17) {
            System.out.println("You go to school kid .");
        } else if (age >= 18 && age < 22) {
            System.out.println("You at university.");
        } else if (age > 23 && age < 60) {
            System.out.println("You should be at work.");
        } else {
            System.out.println("You to old i respect it you reach nice age");

        }
    }
}
