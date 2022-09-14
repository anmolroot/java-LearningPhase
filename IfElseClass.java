package ConditionalStatement;
import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfPetals = sc.nextInt();
        if (noOfPetals % 2 == 0) {
            System.out.println("He loves me");
        } else {
            System.out.println("He loves me NOT");
        }

    }
}
