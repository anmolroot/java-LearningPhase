package JavaBasics;

public class CommandLineArgument {
    public static void main(String []args) {
        int s = 0;
        for(int i = 0; i< args.length; i++)
            s = s + Integer.parseInt(args[i]);
        System.out.println("Sum is "+s);
    }
}
// to run this file this method is for file having packages
//  javac -d . CommandLineArgument.java
//  java JavaBasics.CommandLineArgument 
