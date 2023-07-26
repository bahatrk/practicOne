import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int NumberOne = input.nextInt();
        System.out.println("Enter the second number:");
        int NumberTwo = input.nextInt();
        System.out.println("Enter the third number:");
        int NumberThree = input.nextInt();
        int total;
        total = NumberOne + NumberTwo;
        System.out.println("ResultOne:"+total);
        int multiply ;
        multiply = total * NumberThree;
        System.out.println("ResultTwo:"+multiply);
        int ResultOne;
        ResultOne = NumberOne + NumberTwo;
        int ResultTwo = total * NumberThree;
        int ResultThree;
        ResultThree = ResultTwo % ResultOne;
        System.out.println("Result:"+ResultThree);









        }
    }