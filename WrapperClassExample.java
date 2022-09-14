package JavaBasics;

public class WrapperClassExample {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("1010101", 2); // stores the variable value as object
        Double d1 = Double.valueOf("3.14");
        int a = Integer.parseInt("123");
        Double b = Double.parseDouble("3.14");
        int c = i1.intValue(); // we use intValue() to store the vale of object into a variable
    }
}
