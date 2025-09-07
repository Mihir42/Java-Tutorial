//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Wrapper classes - Turns primitive data types to objects, wraps the primitive type
         in an object
         Access to certain methods in wrapper classes like toString() and intValue() */

        // Autoboxing - primitive to wrapper classes automatic conversion
        char ch = 'c';
        Character a = ch;

        // Unboxing - Wrapper class to its corresponding primitive data type
        Character ar = ch;
        char b = ar;

        // Rest of the wrapper classes
        byte aByte = 1;
        Byte bByte = Byte.valueOf(aByte); // Use value of or the value itself

        int aInt = 1;
        Integer bInteger = Integer.valueOf(aInt);

        double aDouble = 1.32;
        Double bDouble = Double.valueOf(aDouble);









    }
}