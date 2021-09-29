import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class GuessStarter {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        guess = in.nextInt();
        System.out.print("Your guess is: ");
        System.out.println(guess);
        System.out.print("The number I was thinking of is: ");
        System.out.println(number);
        System.out.print("You were off by: ");
        int difference = Math.abs(number-guess);
        System.out.print(difference);
    }
}
