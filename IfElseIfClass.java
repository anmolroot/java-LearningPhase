package ConditionalStatement;
import java.util.Scanner;
public class IfElseIfClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value <10) {
            System.out.println("Value Smaller then 10");
        } else if (value > 10) {
            System.out.println("Value greater than 10");
        } else {
            System.out.println("Value is "+value);
        }
    }
}
    