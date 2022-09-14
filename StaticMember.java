package JavaBasics;

public class StaticMember {
    int x; // instance variable
    private static int y; // static member variable
    // A non-static member function can not access instance variable bcz static member class
    // variable, subclass can be accessed without object
    public void fun1() {  } // instance member function
    // We can use static member function to access private static member variable
    public static void fun2() { y = 2;  } // static member function.
    static class Test {
        public static String country = "INDIA";
    } // A class can have static member class
}

class Hello {
    public static void main(String[] args) {
        StaticMember.fun2(); // we accessed static member of a class without object
        StaticMember obj1 = new StaticMember(); // here we created a StaticMember class object
        obj1.x = 10; // we accessed instance variable with the help of object
        System.out.println(StaticMember.Test.country);
        // printing the static value of a static variable in static subclass
    }
}

