package JavaBasics;
import java.util.Scanner;
public class ScannerUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        double y = sc.nextDouble();
//        byte z = sc.nextByte();
//        String randomString = sc.nextLine();
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        float simpleInterest = (principal * rate * time) / 100;


        System.out.println("The Simple Interest is " + simpleInterest);

//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(randomString);
    }

}
