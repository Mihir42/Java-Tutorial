public class PrimitiveVSNonPrimitive {

    public static void main(String[] args) {

        // Primitive data types - Stores value directly into memory
        boolean bool1 = true;
        byte by1 = 127;
        char ch1 = 'A';
        int num1 = 1;

        /* Non-primitive data types or reference types -
           Stores a memory address that references the object holding data */

        String str = "Balls"; // Strings
        System.out.println(str);

        ExampleClass exp = new ExampleClass(1,2); // Classes and object
        System.out.println(exp.value1); // exp refers to an object in memory
        System.out.println(exp.value2);

        String[] arrStr = new String[5]; // Arrays

        /* Differences between Primitive and Non-primitive data types

           Primitive :
           - Built into the language
           - Predefined default values like 0 or false
           - No methods
           - Pass by value - changes to a copy of the variable does not affect the original

           Non-primitive data types :
           - Defined by the user
           - Default value of null
           - Have methods
           - Pass by reference - changes to the referenced object affect the original

         */

    }
}
