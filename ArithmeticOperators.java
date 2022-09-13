package operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF A AND B");

//        int a = sc.nextInt();
//        int b = sc.nextInt();


//        double c = (double) a + (double)b;
//        System.out.println("SUM:"+ c);

        int a = 3;
        int b = 7;

//        int c = a++;

        int c = ++a;

        System.out.println("c:"+c+"\na:"+a);



    }
}
