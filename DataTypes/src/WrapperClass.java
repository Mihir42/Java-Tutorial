public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper class - provides an object representation of primitive data types

        /* The need for wrapper classes:

           - Used in collections - collections only store object, use wrapper classes to work
             with collections
           - Utility methods - Range of utility methods from converting numbers to strings to
             comparing numbers

         */

        // Autoboxing: Converting primitive data type to wrapper class
        // Unboxing: Converting wrapper class back to primitive data type

        // Autoboxing: int -> Integers
        int b = 256;
        Integer a = b;

        // Unboxing Integer -> int
        Integer c = 256;
        int d = c;

        // Autoboxing: double -> Double
        double e = 1.1;
        Double f = e;

        // Unboxing: Double -> double
        Double g = 1.1;
        double h = g;

        // Autoboxing: char -> Character
        char i = 'i';
        Character j = i;

        // Unboxing: Character -> char
        Character k = 'k';
        char l = k;

    }
}
