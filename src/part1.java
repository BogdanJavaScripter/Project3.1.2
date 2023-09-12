import java.util.Scanner;
public class part1
{
    public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);
        String Hello = KeyBoard.nextLine();
        if (Hello.equals("Hello")) {
            System.out.println("Thank than use our program");
        } else {
            System.out.println("leave out of this program ");
        }

        System.out.print("Enter a program  language : ");
        String day = KeyBoard.nextLine();

        switch (day.toLowerCase()) {

            case "java":
                System.out.println("Your is Book Effective Java ");
                break;
            case "python":
                System.out.println("Your Book is Think Python: How to Think Like a Computer Scientist ");
                break;
            case "C++":
                System.out.println("Your Book is Effective Modern C++: 42 Specific Ways to Improve Your Use of C++11 and C++14 ");
                break;
            case "javascript":
                System.out.println("Your Book is JavaScript. The Definitive Guide. Master the world's Most-Used David Flanagan ");
                break;
            case "ruby":
                System.out.println("Your Book is The Ruby Programming Language ");
                break;
            case "C#":
                System.out.println("Your Book C# 9.0 in a Nutshell: The Definitive Reference ");
                break;
            case "objective-C":
                System.out.println("Your Book Objective-C Pocket Reference" );
            default:
                System.out.println("I dont know other Books and languages .");


        }
    }
}


