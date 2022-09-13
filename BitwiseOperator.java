package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        int c = b >> 2; // right shift mean divide by 2 the number of shifts.
        int d = b << 2; // left shift mean multiply by 2 the number of shifts.


        System.out.println(c);
        System.out.println(d);
    }
}