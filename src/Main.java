import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int customerAge = 0;
        System.out.print("Enter your age: ");
        customerAge = in.nextInt();
        if (customerAge >= 21) {
            System.out.println("You receive a paper wrist band.");
        }
    }
}